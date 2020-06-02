// import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

    // @Test
    // public void testGetMessage() {
    // LeapYear hw = new LeapYear();
    // assertEquals("Hello World!", hw.getMessage());
    // }

    @Test
    public void whenMoreThan4NumbersAreUsedThenAnExceptionIsThrown() {
        LeapYear.isLeapYear("2395");

    }

    @Test
    public void yearShouldBeDivisibleByFourAnd100And400IfNotExceptionIsThrow() {
        Assert.assertEquals(true, LeapYear.isLeapYear("2000"));
        Assert.assertEquals(false, LeapYear.isLeapYear("2001"));
        Assert.assertEquals(true, LeapYear.isLeapYear("2004"));
        Assert.assertEquals(false, LeapYear.isLeapYear("1900"));

    }
}