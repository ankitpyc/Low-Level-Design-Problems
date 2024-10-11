import TaskNotifyInf.QueueObserver;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public class WorkerThreads extends Thread {

    BlockingDeque<Callable<Integer>> queue;
    AtomicBoolean isShutDownInitiated;
    private Callable<Integer> tasks;

    public WorkerThreads(BlockingDeque<Callable<Integer>> taskqueue, AtomicBoolean isShutDownInitiated) {
        this.queue = taskqueue;
        this.isShutDownInitiated = isShutDownInitiated;

    }

    @Override
    public void run() {
        while (!isShutDownInitiated.get() || (!queue.isEmpty())) {
            try {
                Callable<Integer> task = queue.take();
                task.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                if (isShutDownInitiated.get()) {
                    break;
                }
            }
        }
    }


}
