import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_GuessingNumberTest{

    @Before
    public void setUp()
    {
        testObj=new Q8_GuessingNumber();
    }
  Q8_GuessingNumber testObj;

    @After
    public void tearDown()
    {
        testObj=null;
    }

@Test
    public void testGuessingNumber()
    {
        String  expectedValue,actualValue="Number guessed is more than original number";
        expectedValue=testObj.guessingsNumber(70);
        assertEquals(expectedValue,actualValue);

    }

}