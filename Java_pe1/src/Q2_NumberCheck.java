import java.util.Scanner;

public class Q2_NumberCheck {


    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number= scan.nextInt();



        if (number>=20 && number<=30 && number%2!=0)
        {
            System.out.print("Tom");
        }
        else if(number>=20 && number<=30 && number%2==0)
        {
            System.out.print("jerry");
        }
        else
            System.out.print("Number not in tha range");
    }



}