import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();

        int age = 0;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        while (age < 0) {
            System.out.println("Age cannot be negative. Please enter a valid age.");
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        }

        System.out.println("Your age is: " + age);
        sc.close();
        
    }
}
