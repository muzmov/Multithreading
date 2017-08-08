import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {
    @Test
    public void stringToInt1() {
        Assert.assertEquals(1, Numbers.stringToInt("one"));
    }

    @Test
    public void stringToInt19() {
        Assert.assertEquals(19, Numbers.stringToInt("nineteen"));
    }

    @Test
    public void stringToInt21() {
        Assert.assertEquals(21, Numbers.stringToInt("twenty one"));
    }

    @Test
    public void stringToInt100() {
        Assert.assertEquals(100, Numbers.stringToInt("one hundred"));
    }

    @Test
    public void stringToInt123() {
        Assert.assertEquals(123, Numbers.stringToInt("one hundred twenty three"));
    }

    @Test
    public void stringToInt9999() {
        Assert.assertEquals(9999, Numbers.stringToInt("nine thousand nine hundred ninety nine"));
    }

}