import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 implements Runnable {
    private MyBlockingQueue queue;

    public Task1(MyBlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            while ((line = br.readLine()) != null && !line.equals("exit")){
                if (Numbers.isCorrect(line)) queue.add(line);
                else System.out.println("Incorrect number!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
