
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_NumberCheckTest{


    @Before
    public void setUp()
    {
        obj=new Q2_NumberCheck();
    }
Q2_NumberCheck obj;

    @Test
      public void testCheckEvenOrOddInRange()
    {
        String expectedValue="Tom",actualValue;
        actualValue=obj.conditionalChecks(25);
        assertEquals(expectedValue,actualValue);

    }

    @After
    public void tearDown()
    {
        obj=null;
    }



}
