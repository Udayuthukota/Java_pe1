import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q9_ReverseStringTest {

    @Before
    public  void setUp()
    {
        testObj=new Q9_ReverseString();
    }

    Q9_ReverseString testObj;

    @After
    public void tearDown()
    {
        testObj=null;
    }


    @Test
    public void testReverseString()
    {
        String expectedValue="nodnol",actualValue;
        actualValue=testObj.ReverseString("london");
        assertEquals(expectedValue,actualValue);
    }

}