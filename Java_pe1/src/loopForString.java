import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loopForString{

    public static void main (System[] args) throws IOException
    {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the word");
        String name = reader.readLine();
        int i;
        System.out.print(name);


    }
}
