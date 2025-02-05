import java.util.Arrays;

public class demo064 {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        if (numbers.length >= 2) {
            int temp = numbers[0];
            numbers[0] = numbers[numbers.length - 1];
            numbers[numbers.length - 1] = temp;

            System.out.println("Array after swapping first and last element: " + Arrays.toString(numbers));
        } else {
            System.out.println("Array must have at least two elements.");
        }
    }
}
