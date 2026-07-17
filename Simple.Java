import java.util.Scanner;

public class ShoppingCart {

    static Scanner sc = new Scanner(System.in);

    static String[] products = new String[20];
    static double[] prices = new double[20];
    static int[] quantities = new int[20];
    static int count = 0;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== SHOPPING CART =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Calculate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    viewCart();
                    break;

                case 3:
                    calculateBill();
                    break;

                case 4:
                    System.out.println("Thank You for Shopping!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    static void addProduct() {

        System.out.print("Enter Product Name: ");
        products[count] = sc.nextLine();

        System.out.print("Enter Price: ");
        prices[count] = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantities[count] = sc.nextInt();

        count++;

        System.out.println("Product Added Successfully!");
    }

    static void viewCart() {

        if (count == 0) {
            System.out.println("Cart is Empty.");
            return;
        }

        System.out.println("\n===== CART ITEMS =====");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + products[i]);
            System.out.println("Price    : ₹" + prices[i]);
            System.out.println("Quantity : " + quantities[i]);
            System.out.println("-------------------------");
        }
    }

    static void calculateBill() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total += prices[i] * quantities[i];
        }

        System.out.println("\n===== BILL =====");
        System.out.println("Total Amount: ₹" + total);

        if (total >= 2000) {
            System.out.println("Discount: 10%");
            System.out.println("Final Amount: ₹" + (total * 0.90));
        } else {
            System.out.println("No Discount");
        }
    }
}
