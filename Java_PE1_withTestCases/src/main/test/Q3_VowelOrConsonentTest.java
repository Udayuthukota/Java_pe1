import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_VowelOrConsonentTest {


    @Before

    public void setUp()
    {
        obj=new Q3_VowelOrConsonent();
    }
    Q3_VowelOrConsonent obj;

    @Test

    public void testCheckingVowelOrConsonent()
    {
        String expectedValue="Consonent ",actualValue;


        actualValue=obj.checkVowelOrConsonent("p");

        assertEquals(expectedValue,actualValue);

    }

    @Test

    public void testCheckingVowelOrConsonent1()
    {
        String expectedValue="Vowel Consonent ",actualValue;


        actualValue=obj.checkVowelOrConsonent("ap");

        assertEquals(expectedValue,actualValue);

    }



}