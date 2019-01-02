//Looping and printing  a number n number of times
import java.util.Scanner;

public class Q4_LoopTillNthTerm {


    public String numberSeries(int number)
    {

        StringBuilder result = new StringBuilder();

        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
                result.append(i+" ");
            }
        }
         return result.toString();
    }

    public static void main(String[] args)  {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = scan.nextInt();

        Q4_LoopTillNthTerm obj= new Q4_LoopTillNthTerm();

        obj.numberSeries(number);


    }





}
