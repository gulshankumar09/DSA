public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    // Divides the array using recursive method
    public static void mergeSort(int arr[], int si, int ei) {
        // Base case: If the subarray has only one element or is empty, return
        if (si >= ei) {
            return;
        }

        // Calculate the midpoint to divide the array into two halves
        int mid = si + (ei - si) / 2;

        // Recursively sort the left half
        mergeSort(arr, si, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, ei);

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    // Merges two sorted halves into a single sorted array
    public static void merge(int arr[], int si, int mid, int ei) {
        // Create a temporary array to store the merged result
        int temp[] = new int[ei - si + 1];

        // Initialize pointers for the left and right halves, and the temporary array
        int i = si; // Pointer for the left half
        int j = mid + 1; // Pointer for the right half
        int k = 0; // Pointer for the temporary array

        // Compare elements from both halves and add the smaller element to the temporary array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Add any remaining elements from the left half
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Add any remaining elements from the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements from the temporary array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Prints the elements of the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
