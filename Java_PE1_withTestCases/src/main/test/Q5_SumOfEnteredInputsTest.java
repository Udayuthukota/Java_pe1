
import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

        public class Q5_SumOfEnteredInputsTest {

            @Before
        public void setUp() throws Exception
            {
            }
            @After
         public void tearDown() throws Exception
            {
        }
        Q5_SumOfEnteredInputs input = new Q5_SumOfEnteredInputs();
            @Test
           public void input_sums(){
             int[] myIntArray = {4,4,4,4,4};
         String expectedValue = "Sum of Entered Inputs:20";
          String actualValue = input.input_sum(myIntArray);
         assertEquals(expectedValue,actualValue);
            }
}