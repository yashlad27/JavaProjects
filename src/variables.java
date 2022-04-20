import java.util.Locale;

public class variables {
    public static void main(String[] args) {
        String name = "Yash";
        System.out.println(name);

        int my_num = 1090;
        System.out.println(my_num);

        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);

        char myLetter = 'D';
        System.out.println(myLetter);

        boolean myBool = true;
        System.out.println(myBool);

        // declare many variables
        int x=10, y=2, z=1;
        System.out.println("Addition of 3 numbers is: ");
        System.out.println(x+y+z);

        String txt = "ASWASVBIKEFRABUIVAVBUBVHVBAJfbhdwqbguooggaosnvbgrvnfioufghnbwroFHB";
        System.out.println("The length of string is: " + txt.length());

        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        // finding a char in string:-
        String new_string = "Hello My name is Yash!";
        System.out.println(new_string.indexOf("is"));

    }
}
