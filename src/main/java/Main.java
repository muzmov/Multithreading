public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue queue = new MyBlockingQueue();
        Thread t1 = new Thread(new AddItemsTask(queue));
        Thread t2 = new Thread(new PollItemsTask(queue));
        t1.start();
        t2.start();
        t1.join();
        t2.interrupt();
    }
}
