////Adding all input number untill you enter 0
//import java.util.*;
//public class Q5_AdditionUsingScanner {
//
//
//
//
//
//    public static void main(String[] args)
//    {
//        int number,total=0;
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//
//        while ((number = scan.nextInt()) != 0) {
//            total += number;
//        }
//        System.out.println("Sum of all numbers is "+total);
//    }
//}
//
//

import java.util.Scanner;public class Q5_SumOfEnteredInputs{


    public static void main(String args[]) {
        System.out.println("Enter the elements:");
        Scanner num = new Scanner(System.in);
        int y = num.nextInt();
        int[] array = new int[y];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<y; i++)
        {
            array[i] = scanner.nextInt();
        }
        System.out.println(inputSum(array));
    }
    public static String inputSum(int[] array){
        int sum = 0;        for( int num : array) {
            sum = sum + num;
        }
        System.out.print("Sum of array elements is:"+sum);
        return ("Sum of Entered Inputs:"+sum);
    }
}
