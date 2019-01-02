import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_VowelOrConsonent {


    public String checkVowelOrConsonent(String name)


             {
                 int i;
                 for(i=0;i<name.length();i++)
                 {

                     if(name.charAt(i) == 'a' || name.charAt(i)== 'e' || name.charAt(i) == 'i'
                             || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                        // System.out.println(name.charAt(i)+"-vowel");
                         return "Vowel";
                     }
                     else if((name.charAt(i) >= 'a'&& name.charAt(i) <= 'z'))
                     {
                         //System.out.println(name.charAt(i)+"-Consonent");
                         return "Consonent";
                     }
                     else
                     {
                         //System.out.println(name.charAt(i)+"Error");
                         return "Error";
                     }


                 }

             }


        public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("enter the word");
            String name = reader.readLine();
            int i;

            for(i=0;i<name.length();i++)
            {

                if(name.charAt(i) == 'a' || name.charAt(i)== 'e' || name.charAt(i) == 'i'
                        || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                System.out.println(name.charAt(i)+"-vowel");
                                                  }
                else if((name.charAt(i) >= 'a'&& name.charAt(i) <= 'z'))
                {
                    System.out.println(name.charAt(i)+"-Consonent");
                }
                else
                {
                    System.out.println(name.charAt(i)+"Error");
                }


            }
        }
    }

