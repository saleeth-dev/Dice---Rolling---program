
public class Super {
    public static void main(String[] args) {
       
    int[] numbers = {3, 5, 9, 2, 8, 4};
    int target = 12;
    boolean isFound = false;

    for(int i = 0; i < numbers.length; i++) {
        if(target == numbers[i]) {
            System.out.println("Found the target number: " + i);
            isFound = true;
            break;
        }
    }

    if(!isFound) {
        System.out.println("Element is notfound in the array.");
    }
    
}
}
