//Looping a string at the end for n number of times
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Q10_Looping {


    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the word");
        String name = reader.readLine();
        int i;
        System.out.println("enter the number");
        Scanner scan=new Scanner(System.in);
        i= scan.nextInt();
        int j=name.length()-i;
        System.out.print(name);
        for(int k=0;k<i;k++) //loop to print end string for n number of times
        {
            for(int l=j;l<name.length();l++)
            {
                System.out.print(name.charAt(l));
            }
        }

    }
}
