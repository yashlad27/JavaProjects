import java.util.*;
public class controlFlow {
    public static void main(String[] args) {
        System.out.println("Enter an integer value: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        switch (x){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;

        }
    }
}
