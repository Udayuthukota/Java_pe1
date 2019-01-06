//Sorting a number and adding even numbers
import java.util.Scanner;
public class Q7_SortingNumber {

    public String sortingNumber(int inputInt)
    {
        StringBuilder result = new StringBuilder();

        float   sum = 0;
        int    array[] = new int[10];
        for(int  i=0;i<10;i++){
            array[i] = 0;
        }        while (((inputInt%10)>0) || (inputInt > 0)){
        array[inputInt%10]++;
        inputInt = inputInt/10;
    }
        System.out.print("Sorted number in non-increasing order : ");
        for(int  i=9;i>=0;i--){
            while(array[i] > 0){
                result.append(i);
                System.out.print(i);
               array[i]--;
            }
        }


     return result.toString();

    }
    public boolean sumOfEvenNumber(int inputInt) {

        float sum = 0;
        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = 0;
        }

        while (((inputInt % 10) > 0) || (inputInt > 0)) {
            array[inputInt % 10]++;
            inputInt = inputInt / 10;
        }

        for (int i = 9; i >= 0; i--) {
            while (array[i] > 0) {
                if ((i % 2) == 0)
                    sum = sum + i;
                array[i]--;
            }
        }

        if (sum > 15) {
            System.out.println("Sum of even numbers :" + sum);
            return true;
        } else {
            System.out.println("Sum of even numbers :" + sum);
            return false;


        }
    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to sort");
        int     inputInt = 0,sum=0;
        inputInt = scanner.nextInt();
        Q7_SortingNumber myObj=new Q7_SortingNumber();
        myObj.sortingNumber(inputInt);
        myObj.sumOfEvenNumber(inputInt);
           }
}



