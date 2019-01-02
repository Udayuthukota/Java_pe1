import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class Q1_PalindromeTest {

    @Before
    public void setUp()
        {
            obj=new Q1_Palindrome();
        }


    Q1_Palindrome obj;
    @Test

    public void checkingThePalindromeCondition(){

        long expectedValue=2468642;
        long actualValue=obj.Palindrome(2468642);
        assertEquals(expectedValue,actualValue);
    }


    @Test
    public void  CheckingTheSum() {

        long expectedValue=32;
        long actualValue=obj.calulatingTheSum(2468642);
        assertEquals(expectedValue,actualValue);
    }


    @After

    public void tearDown()
    {
        obj=null;
    }


}