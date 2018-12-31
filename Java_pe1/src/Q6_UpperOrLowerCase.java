import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class  Q6_UpperOrLowerCase{

    public static  void main(String[] args) throws IOException
    {
        Scanner letter = new Scanner(System.in);
        System.out.print("enter a letter");
        char name = letter.next().charAt(0);
         if((name>= 'a'&& name <= 'z')) {
             System.out.println(name + "-small letter");
         }
         else if((name>= 'A'&& name <= 'Z'))
         {
             System.out.println(name+"-Capital letter");
         }
         else if((name>= '0'&& name <= '9'))
         {
             System.out.println(name+"-integer");
         }
         else
         {
             System.out.println((name+"-Special Character"));
         }





    }
}
