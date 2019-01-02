import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_PalindromeTest {
   // Q1_Palindrome ob;

    @Test
    public void returnnotnull(){
        int i=121,j;
        j=Q1_Palindrome.Palindrome();
        assertEquals(i,j);
    }


}