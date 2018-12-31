//Reversing a String
public class Q9_ReverseString {

    public static void main(String[] args) {

        String str1 = "landon";
        String str2 = "";
//Loop for Reversing a String
        for (int i=str1.length()-1; i>=0; i--) {
            str2 += str1.charAt(i);
        }

        System.out.println(str2);

    }
}