public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    // Prints the elements of the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // Base case: If the subarray has only one element or is empty, return
        if (si >= ei) {
            return;
        }

        // Partition the array and get the partition index
        int pIdx = partition(arr, si, ei);

        // Recursively sort the left subarray (elements smaller than pivot)
        quickSort(arr, si, pIdx - 1);

        // Recursively sort the right subarray (elements greater than pivot)
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        // Choose the last element as the pivot
        int pivot = arr[ei];
        int i = si - 1;

        // Traverse the array from the start to the second-to-last element
        for (int j = si; j < ei; j++) {
            // If the current element is smaller than or equal to the pivot,
            // swap it with the element at the correct position (i)
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Swap the pivot element (arr[ei]) with the element at the correct position (i)
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        // Return the partition index
        return i;
    }
}
