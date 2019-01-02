import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q7_SortingNumberTest {


    @Before
    public void setUp()
    {
        testObj=new Q7_SortingNumber();
    }

    Q7_SortingNumber testObj;

    @After
    public void tearDown()
    {
        testObj=null;
    }


    @Test
    public void testSortingNumber()
    {
        String expectedValue="544332",actualValue;
        actualValue=testObj.sortingNumber(234534);
        assertEquals(expectedValue,actualValue);
    }
@Test
    public void testSumOfEvenNumbers()
    {
    boolean expectedValue=false,actualValue;
    actualValue=testObj.sumOfEvenNumber(234534);
    assertEquals(expectedValue,actualValue);
    }




}