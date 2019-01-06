//Guessing a number which is more or less than the number you defined
import java.util.*;
public class Q8_GuessingNumber {

    static String guessingsNumber(int inputNumber) {
        int target = 60;
        String result;

        if (inputNumber > target) {
            System.out.println("Number guessed is more than original number");
            result="Number guessed is more than original number";
            return result;
        } else if(inputNumber<target) {
            System.out.println("Number guessed is less than original number");
            result="Number guessed is less than original number";
            return result;
        }
        else{
        System.out.print("Number guessed matches the original number");
            result="Number guessed matches the original number";
            return result;
        }
    }


    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println("Enter random numbers 1 to 100 to guess target value");
        Q8_GuessingNumber myObj= new Q8_GuessingNumber();
         myObj.guessingsNumber(number);

        //  Q8_GuessingNumber myObj=new Q8_GuessingNumber;


    }
}
