import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  item;
        int count;
        char currency = '$';
        double price;
        double total;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();
        System.out.print("How many would you like to buy?: ");
        count = sc.nextInt();
        System.out.print("What is the price per item?: ");
        price = sc.nextDouble();

        total = count * price;
        
        System.out.println("\nYou have bought" + " " + count + " " + item + "/s");
        System.out.println("Your total is: " + currency + total);

        sc.close();
    }
}
