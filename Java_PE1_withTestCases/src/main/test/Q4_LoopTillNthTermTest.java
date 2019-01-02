import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_LoopTillNthTermTest {


    @Before
    public void setUp()
    {
        testObj=new Q4_LoopTillNthTerm();
    }
 Q4_LoopTillNthTerm testObj;

    @Test
    public void testLoopTillNthTerm()
    {

        String expectedValue="1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ",actualValue;
        actualValue=testObj.numberSeries(5);
        assertEquals(expectedValue,actualValue);
    }

    @After
    public  void tearDown()
    {
        testObj=null;
    }


}