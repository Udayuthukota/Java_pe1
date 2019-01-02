import java.util.Scanner;

public class Q2_NumberCheck {

    public String conditionalChecks(int number)
    {
        String name;
        if (number>=20 && number<=30 && number%2!=0)
        {
            name="Tom";
            return name;
        }
        else if(number>=20 && number<=30 && number%2==0)
        {
            name="jerry";
            return name;
        }
        else {
            name = "Number not in tha range";
            return name;
        }

    }




    public static void main(String[] args) {

        int inputNumber;
        String number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        inputNumber= scan.nextInt();

        Q2_NumberCheck myNum=new Q2_NumberCheck();

        number=myNum.conditionalChecks(inputNumber);

       System.out.print(number);
     /*   if (number>=20 && number<=30 && number%2!=0)
        {
            System.out.print("Tom");
        }
        else if(number>=20 && number<=30 && number%2==0)
        {
            System.out.print("jerry");
        }
        else
            System.out.print("Number not in tha range");
            */
    }



}
