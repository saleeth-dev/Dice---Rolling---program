import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius;

        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextInt();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference of the circle is: %.1fcm%n", circumference);
        System.out.printf("The area of the circle is: %.1fcm²%n", area);
        System.out.printf("The volume of the sphere is: %.1fcm³%n", volume);

        sc.close();
    }
}
