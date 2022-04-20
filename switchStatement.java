import java.util.*;
public class switchStatement {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter an ALPHABET: ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        switch (ch){
            case 'A':
                System.out.println("Value of char is "+ch);
                break;
            case 'B':
                System.out.println("Value of char is "+ch);
                break;
            case 'C':
                System.out.println("Value of char is "+ch);
                break;
            case 'D':
                System.out.println("Value of char is "+ch);
                break;
            case 'E':
                System.out.println("value of char is "+ch);
                break;
            default:
                System.out.println("Other value was entered: "+ch);
                break;
        }
    }
}
