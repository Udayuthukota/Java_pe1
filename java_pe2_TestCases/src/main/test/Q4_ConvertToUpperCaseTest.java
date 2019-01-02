import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class Q4_ConvertToUpperCaseTest {



    @Before
    public void setUp(){
        testObj=new Q4_ConvertToUpperCase();
    }
   Q4_ConvertToUpperCase testObj;

    @Test
    public void testConvertToUpperCaseSuccess()
    {
        String expectedValue="STACKROUTE10",actualValue;
        actualValue=testObj.convertToUpperCase("stackroute");
         assertEquals(expectedValue,actualValue);
    }


    @Test
    public void testConvertToUpperCaseSuccess()
    {
        String expectedValue="BOEINGINDIA11",actualValue;
        actualValue=testObj.convertToUpperCase("bOEINGinDIA");
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public  void testConvertToUpperCaseFailure()
    {
        String expectedValue="StackRoute10",actualValue;
        actualValue=testObj.convertToUpperCase("stackroute");
        assertNotEquals(expectedValue,actualValue);
    }


    @After
    public void tearDown()
    {
        testObj=null;
    }


}

