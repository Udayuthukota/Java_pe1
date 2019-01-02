import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q6_UpperOrLowerCaseTest {



    @Before
    public void setUp()
    {
    obj=new Q6_UpperOrLowerCase();
    }

    Q6_UpperOrLowerCase obj;

    @Test
    public void checkingForCapitalOrSmallLetter()
    {
        String expectedValue="Capital Letter",actualValue;
        actualValue=obj.checkCapitalOrSmallLetter('A');
        assertEquals(expectedValue,actualValue);
    }

    @After
    public void tearDown()
    {
        obj=null;
    }


}