import java.util.Scanner;
public class readingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth year: ");

        boolean hasNextInt = sc.hasNextInt();
         
        int yearOfBirth = sc.nextInt();
        sc.nextLine(); // handle next line char

        System.out.println("Enter Your name: ");
        String name = sc.nextLine();
        int age = 2022 - yearOfBirth;

        if(age>=0 && age<=100){
            System.out.println("Your name is "+name+", and you are "+age+" years old.");
        }else{
            System.out.println("Invalid year of birth!");
        }


        sc.close();
    }
}
