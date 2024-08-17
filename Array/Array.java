public class Array {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // remove even numbers from array

    public static int[] removeEven(int[] arr) {
        int oddCount = 0; // new variable to count the odd Array and below for loop for that

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] oddArray = new int[oddCount]; // new array declared and initialized

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArray[index] = arr[i];
                index++;
            }
        }
        return oddArray;

    }
    // reverse an array

    public static int[] reverseArray(int[] arr) {

        int arrCount = arr.length; // count the lenth of array

        int[] reverseArr = new int[arrCount]; // declared and initialized a new array

        for (int i = arrCount - 1; i >= 0; i--) {
            reverseArr[arrCount - 1 - i] = arr[i]; // revarray[0] = arr[4]
        }
        return reverseArr;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        printArray(arr);

        printArray(removeEven(arr));

        printArray(reverseArray(arr));

        // Providing input as a parameter.
        // a.printArray(new int[] {3,2,3,5});
    }
}
