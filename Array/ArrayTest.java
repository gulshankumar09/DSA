import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayTest {

    public static void main(String[] args) {
        // Redirect standard output to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Test case 1: Empty array
        int[] arr1 = {};
        Array.printArray(arr1);
        assert outputStream.toString().trim().equals("") : "Test case 1 failed";
        outputStream.reset();

        // Test case 2: Array with positive numbers
        int[] arr2 = {1, 2, 3, 4, 5};
        Array.printArray(arr2);
        assert outputStream.toString().trim().equals("1 2 3 4 5") : "Test case 2 failed";
        outputStream.reset();

        // Test case 3: Array with negative numbers
        int[] arr3 = {-1, -2, -3, -4, -5};
        Array.printArray(arr3);
        assert outputStream.toString().trim().equals("-1 -2 -3 -4 -5") : "Test case 3 failed";
        outputStream.reset();

        // Test case 4: Array with both positive and negative numbers
        int[] arr4 = {-1, 2, -3, 4, -5};
        Array.printArray(arr4);
        assert outputStream.toString().trim().equals("-1 2 -3 4 -5") : "Test case 4 failed";
        outputStream.reset();

        // Restore original output stream
        System.setOut(originalOut);
        System.out.println("All test cases passed.");
    }
}