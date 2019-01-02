import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_PowerOfFourTest {


    @Before
    public void setUp()
    {
        testObj=new Q2_PowerOfFour();
    }

    Q2_PowerOfFour testObj;

    @Test
    public void testPowerOfFour()
    {
     boolean expectedValue=true,actualValue;
        actualValue=(testObj.PowerOfFour(256));
        assertEquals(expectedValue,actualValue);
    }


    @Test
    public  void testPowerOfFour1()
    {
        boolean expectedValue=false,actualValue;
        actualValue=(testObj.PowerOfFour(121));
        assertEquals(expectedValue,actualValue);

    }


    @After
    public void tearDown()
    {
        testObj=null;
    }

}