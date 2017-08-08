import java.util.*;
import java.util.stream.Stream;

public class MyBlockingQueue {
    private List<String> numbers = new ArrayList<String>();

    public synchronized void add(String number) {
        numbers.add(number);
        notifyAll();
    }

    public synchronized String pollMin() throws InterruptedException {
        Optional<String> result;
        Comparator<String> comparator = Comparator.comparingInt(Numbers::stringToInt);
        while (!(result = numbers.stream().min(comparator)).isPresent()) {
            wait();
        }
        numbers.remove(result.get());
        return result.get();
    }
}
