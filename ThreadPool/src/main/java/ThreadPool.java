import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadPool {

    private static final Integer THREAD_COUNT = 10;

    private static final Integer QUEUE_SIZE = 5;

    private final AtomicBoolean isShutDownInitiated;

    private BlockingDeque<WorkerThreads> workerThreads;

    public BlockingDeque<Callable<Integer>> blockingDeque;

    private static ThreadPool instance = null;

    private ThreadPool() {
        workerThreads = new LinkedBlockingDeque<>(THREAD_COUNT);
        isShutDownInitiated = new AtomicBoolean(false);
        this.blockingDeque = new LinkedBlockingDeque<>(QUEUE_SIZE);
        for (int i = 0; i < QUEUE_SIZE; i++) {
            WorkerThreads wt = new WorkerThreads(blockingDeque, isShutDownInitiated);
            wt.start();
            workerThreads.add(wt);
        }
    }

    public static synchronized ThreadPool getInstance() {
        if (instance == null) {
            instance = new ThreadPool();
        }
        return instance;
    }

    public void submitTask(Callable<Integer> task) throws InterruptedException {
       System.out.println("Task Submitted");
        if (!isShutDownInitiated.get()) {
            blockingDeque.offer(task);
        }
    }

    public void shutdown(){
        isShutDownInitiated.set(true);
    }
}
