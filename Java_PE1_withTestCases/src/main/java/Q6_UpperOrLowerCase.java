//To check whether the input number is lower case or upper case
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class  Q6_UpperOrLowerCase{

    public String checkCapitalOrSmallLetter(char name)
    {

        if((name>= 'a'&& name <= 'z')) {
            System.out.println(name + "-small letter");

            return "Small Letter";
        }
        else if((name>= 'A'&& name <= 'Z'))
        {
            System.out.println(name+"-Capital letter");
            return "Capital Letter";
        }
        else if((name>= '0'&& name <= '9'))
        {
            System.out.println(name+"-integer");
            return "Integer";
        }
        else {
            System.out.println((name + "-Special Character"));
            return "Special Character";
        }

    }




    public static  void main(String[] args) throws IOException
    {
        Scanner letter = new Scanner(System.in);
        System.out.print("enter a letter");
        char name = letter.next().charAt(0);

        Q6_UpperOrLowerCase myobj= new Q6_UpperOrLowerCase();
         myobj.checkCapitalOrSmallLetter(name);

    }
}
