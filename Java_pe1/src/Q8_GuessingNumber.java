//Guessing a number which is more or less than the number you defined
import java.util.*;
public class Q8_GuessingNumber {
    public static  void  main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random numbers 1 to 100 to guess target value");
        int     inputInt = 0;
        int     target  =  60;
        while ((inputInt=scanner.nextInt())!= target){
            if(inputInt > target){
                System.out.println("Number guessed is more than original number");
            }else {
                System.out.println("Number guessed is less than original number");
            }
        }        System.out.print("Number guessed matches the original number");    }
}
