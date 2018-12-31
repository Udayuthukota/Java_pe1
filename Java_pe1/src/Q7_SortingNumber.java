import java.util.Scanner;
public class Q7_SortingNumber {

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to sort");
        int     inputInt = 0;
        inputInt = scanner.nextInt();
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
                System.out.print(i);
                if((i%2)==0)
                    sum = sum+i;
                array[i]--;
            }
        }        System.out.println();        if(sum > 15){
            System.out.println("Sum of even numbers :" + sum);
            System.out.print("true");
        }else {
            System.out.println("Sum of even numbers :" + sum);
            System.out.print("false");
        }    }
}



