//Palindrom of  a number
import java.util.*;
public class Q1_Palindrome {

//Checking for a palindrome
    public  int Palindrome(int number)
    {
        int reverseNumber=0;
        int remainder=0;
        while(number!=0)   //Loop to reverse a number
        {

            remainder=number%10;
            reverseNumber=reverseNumber*10+remainder;
            number=number/10;

        }
        return reverseNumber;
    }

    //calculating the sum is greater than 25 or not
    public int  calulatingTheSum(int number)
    {

        int remainder=0,sum=0;
        while(number!=0)   //Loop to reverse a number
        {

            remainder = number % 10;
            if (remainder % 2 == 0) {
                sum = sum + remainder;
            }
            number = number / 10;
        }

        return sum;

    }



    //main program begins here
    public static void main(String[] args)

    {

        int number,originalNumber,reverseNumber=0,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        originalNumber=scan.nextInt();
       number=originalNumber;

        Q1_Palindrome myobj= new Q1_Palindrome();

        reverseNumber=myobj.Palindrome(number);
        sum=myobj.calulatingTheSum(number);

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
