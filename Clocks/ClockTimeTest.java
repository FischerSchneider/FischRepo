

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClockTimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClockTimeTest
{
    /**
     * Default constructor for test class ClockTimeTest
     */
    public ClockTimeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test1()
    {
        ClockTime clockTim1 = new ClockTime();
        ClockTime clockTim2 = new ClockTime(4, 45, 32);
        assertEquals(false, clockTim1.equals(clockTim2));
        assertEquals(4, clockTim2.getHour());
        assertEquals(45, clockTim2.getMinute());
        assertEquals(32, clockTim2.getSecond());
        clockTim1.setHour(4);
        clockTim1.setMinute(45);
        clockTim1.setSecond(32);
        assertEquals(true, clockTim1.equals(clockTim2));
    }
}

