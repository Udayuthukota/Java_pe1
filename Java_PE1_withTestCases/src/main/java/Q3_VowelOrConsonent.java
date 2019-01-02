import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_VowelOrConsonent {

//method to check vowel or consonent
    public String checkVowelOrConsonent(String name)
    {

        StringBuilder result = new StringBuilder();


        for(int i=0;i<name.length();i++)
        {

           // System.out.print(name.length());
            if(name.charAt(i) == 'a' || name.charAt(i)== 'e' || name.charAt(i) == 'i'
                    || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                 System.out.println(name.charAt(i)+"-vowel");
                result.append("Vowel ");

            }
            else if((name.charAt(i) >= 'a'&& name.charAt(i) <= 'z'))
            {
                System.out.println(name.charAt(i)+"-Consonent");
                result.append("Consonent ");
            }
            else
            {
                System.out.println(name.charAt(i)+"Error");
                result.append(" Error");

            }


        }
        return result.toString();
    }


    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the word");
        String name = reader.readLine();
        int i;
        Q3_VowelOrConsonent obj=new Q3_VowelOrConsonent();

        obj.checkVowelOrConsonent(name);

    }
}

