import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_EvenNumTestTest {



    @Before
    public void setUp()
    {
        testObj= new Q5_EvenNumTest();
    }
    Q5_EvenNumTest testObj;

    @After
    public void tearDown()
    {
        testObj=null;
    }


    @Test
    public void testIsEvenSuccess()
    {
        boolean expectedValue=true,actualValue;
        actualValue=testObj.IsEven(24);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testIsEvenSuccess()
    {
        boolean expectedValue=true,actualValue;
        actualValue=testObj.IsEven(0);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testIsEvenSuccess()
    {
        boolean expectedValue=true,actualValue;
        actualValue=testObj.IsEven(-2);
        assertEquals(expectedValue,actualValue);
    }




    @Test
    public void testIsEvenFailure()
    {
        boolean expectedValue=true,actualValue;
        actualValue=testObj.IsEven(21);
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testIsEvenFailure()
    {
        boolean expectedValue=true,actualValue;
        actualValue=testObj.IsEven(-9);
        assertNotEquals(expectedValue,actualValue);
    }


}