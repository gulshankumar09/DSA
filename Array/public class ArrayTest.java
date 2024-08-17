public class ArrayTest {

    public static void main(String[] args) {
        // Test case 1: Empty array
        int[] arr1 = {};
        Array.printArray(arr1); // Expected output: 

        // Test case 2: Array with positive numbers
        int[] arr2 = {1, 2, 3, 4, 5};
        Array.printArray(arr2); // Expected output: 1 2 3 4 5 

        // Test case 3: Array with negative numbers
        int[] arr3 = {-1, -2, -3, -4, -5};
        Array.printArray(arr3); // Expected output: -1 -2 -3 -4 -5 

        // Test case 4: Array with both positive and negative numbers
        int[] arr4 = {-1, 2, -3, 4, -5};
        Array.printArray(arr4); // Expected output: -1 2 -3 4 -5 
    }
}