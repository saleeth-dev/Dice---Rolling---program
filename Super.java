import java.util.Scanner;

public class Super {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("Enter the number of food items: ");
        size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        foods = new String[size];

        for(int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food item: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods) {
            System.out.println(food);
        }



        scanner.close();
    }
}
