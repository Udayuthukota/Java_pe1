import java.io.IOException;
import java.util.Scanner;

public class Q4_LoopTillNthTerm {



    public static void main(String[] args)  {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = scan.nextInt();

        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
        }

    }





}
