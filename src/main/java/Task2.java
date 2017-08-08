public class Task2 implements Runnable {
    private MyBlockingQueue queue;

    public Task2(MyBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(queue.pollMin());
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("task2 interrupted");
        }
    }
}
