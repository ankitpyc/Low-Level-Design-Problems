import java.util.concurrent.Callable;

public class ThreadPoolDriver {

    public static void main(String[] args) {
        ThreadPool threadPool = ThreadPool.getInstance();
        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Thread executing : " + Thread.currentThread().getName());
                return 1;
            }
        };

        try {
            for (int i = 0; i<40;i++) {
                threadPool.submitTask(task);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (true){}
    }

}
