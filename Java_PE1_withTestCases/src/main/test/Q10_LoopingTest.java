import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q10_LoopingTest {



    @Before
    public void setUp()
    {
      testObj=new Q10_Looping();
    }
    Q10_Looping testObj;

    @After
    public void tearDown()
        {
        testObj=null;
        }

      @Test
        public void testRepeatLastNLetters()
      {
          String expectedValue="Stackrouterouterouterouterouteroute",actualValue;
          actualValue=testObj.repeatLastNLetters(5,"Stackroute");
          assertEquals(expectedValue,actualValue);
      }
    @Test
    public void testRepeatLastNLetters1()
    {
        String expectedValue="Stackroutetete",actualValue;
        actualValue=testObj.repeatLastNLetters(2,"Stackroute");
        assertEquals(expectedValue,actualValue);
    }

}