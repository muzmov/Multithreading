import java.util.HashMap;
import java.util.Map;

public class Numbers {
    private static Map<String, Integer> numbers = new HashMap<String, Integer>();

    static {
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        numbers.put("ten", 10);
        numbers.put("eleven", 11);
        numbers.put("twelve", 12);
        numbers.put("thirteen", 13);
        numbers.put("fourteen", 14);
        numbers.put("fifteen", 15);
        numbers.put("sixteen", 16);
        numbers.put("seventeen", 17);
        numbers.put("eighteen", 18);
        numbers.put("nineteen", 19);
        numbers.put("twenty", 20);
        numbers.put("thirty", 30);
        numbers.put("forty", 40);
        numbers.put("fifty", 50);
        numbers.put("sixty", 60);
        numbers.put("seventy", 70);
        numbers.put("eighty", 80);
        numbers.put("ninety", 90);
        numbers.put("hundred", 100);
        numbers.put("thousand", 1000);
    }

    public static int stringToInt(String number) {
        number = number.toLowerCase();
        String[] words = number.split(" ");
        int result = 0;
        int prevNumber = 0;
        int thisNumber = 0;
        for (String word : words) {
            thisNumber = numbers.get(word);
            if (thisNumber == 100 || thisNumber == 1000) {
                result += prevNumber * thisNumber;
                prevNumber = 0;
            } else {
                result += prevNumber;
                prevNumber = thisNumber;
            }
        }
        result += prevNumber;
        return result;
    }


    public static boolean isCorrect(String number) {
        String[] words = number.split(" ");
        for (String word : words) {
            if (numbers.get(word) == null) return false;
        }
        return true;
    }
}
