public class PollItemsTask implements Runnable {
    private MyBlockingQueue queue;

    public PollItemsTask(MyBlockingQueue queue) {
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
