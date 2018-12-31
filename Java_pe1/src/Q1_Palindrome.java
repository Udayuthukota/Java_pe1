//Palindrom of  a number
import java.util.*;
public class Q1_Palindrome {
//main program begins here
    public static void main(String[] args)

    {

        int originalNumber,number,reverseNumber=0,remainder,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        originalNumber=scan.nextInt();
        number=originalNumber;

        while(number!=0)   //Loop to reverse a number
        {
            remainder=number%10;
            if(remainder%2==0)
            {
                sum=sum+remainder;
            }
            reverseNumber=reverseNumber*10+remainder;
            number=number/10;

        }

//Checking if the original number and reverse number is same or not
        if(originalNumber==reverseNumber)
        {
            System.out.print("The given Number"+originalNumber+" is a palindrome ");
        }
        else
        {
            System.out.print("The given Number"+originalNumber+" is a not palindrome ");

        }
        if(sum<25)
        {
            System.out.print("and sum is less than 25");
        }
        else
        {
            System.out.print("and sum is greater than 25");
        }
    }


}
