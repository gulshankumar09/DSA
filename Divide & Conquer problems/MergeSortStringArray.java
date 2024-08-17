// Question1: Apply Merge sort to sort an array of Strings.
// (Assume that all the characters ina ll the Strings are in lowercase).
// Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
// Sample Output 1: arr = { "earth", "mars", "mercury","sun"}

public class MergeSortStringArray {
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury"};

        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }

    public static void mergeSort(String[] arr, int si, int ei){
        //Base case
        if(si>=ei){
            return;
        }

        //mid
        int mid = si + (ei - si)/2;

        //left part
        mergeSort(arr, si, mid);

        //right part
        mergeSort(arr, mid+1, ei);

        //merge after the sorting the divided part
        merge(arr, si, mid, ei);

    }

    public static void merge(String[] arr, int si, int mid, int ei){
        String temp[] = new String[ei - si +1];

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
    public static void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
