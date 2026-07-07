
public class Super {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"carrot", "broccoli", "spinach"};
        String[] meats = {"chicken", "beef", "pork"};

        String[][] groceries = {fruits, vegetables, meats};

        groceries[0][0] = "pineapple"; 
        groceries[2][0] = "goat";
        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println(); // Print a blank line between categories
        }
    }
}
