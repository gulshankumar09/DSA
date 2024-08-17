# What are Arrays?

An array is a collection of items stored at contiguous memory locations. In C#, arrays are used to store multiple values of the same type in a single variable.

## Key Concepts:

- **Declaration and Initialization**: Understanding how to declare and initialize arrays.
- **Accessing Elements**: How to access and manipulate individual elements within an array.
- **Traversing Arrays**: Iterating through arrays using loops.

```csharp
// Declaration and Initialization
int[] numbers = new int[5]; // Array of 5 integers
numbers[0] = 10; // Assigning value to the first element
numbers[1] = 20; // Assigning value to the second element

// Initialization with values
int[] predefinedNumbers = { 1, 2, 3, 4, 5 };

// Accessing Elements
Console.WriteLine("First element: " + numbers[0]); // Output: 10
Console.WriteLine("Second element: " + predefinedNumbers[1]); // Output: 2

// Traversing Arrays
for (int i = 0; i < predefinedNumbers.Length; i++)
{
    Console.WriteLine("Element at index " + i + ": " + predefinedNumbers[i]);
}
```

## **Multi-Dimensional Arrays**

- **2D Arrays**: Arrays that have rows and columns.
    
    ```csharp
    // 2D Array Declaration and Initialization
    int[,] matrix = new int[3, 3]; // 3x3 matrix
    
    matrix[0, 0] = 1; // Assigning value to the first element
    matrix[1, 1] = 5; // Assigning value to the center element
    
    // 2D Array Initialization with values
    int[,] predefinedMatrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    
    // Accessing Elements
    Console.WriteLine("Element at (1,1): " + predefinedMatrix[1, 1]); // Output: 5
    
    // Traversing 2D Arrays
    for (int i = 0; i < predefinedMatrix.GetLength(0); i++) // rows
    {
        for (int j = 0; j < predefinedMatrix.GetLength(1); j++) // columns
        {
            Console.Write(predefinedMatrix[i, j] + " ");
        }
        Console.WriteLine();
    }
    ```
    
- [**Jagged Arrays**](https://www.notion.so/Array-464904d9c02e4a15b8708dfa3ae089c9?pvs=21): Arrays of arrays, where each "row" can have a different size.
    
    ```csharp
    // Jagged Array Declaration and Initialization
    int[][] jaggedArray = new int[3][];
    jaggedArray[0] = new int[] { 1, 2 };
    jaggedArray[1] = new int[] { 3, 4, 5 };
    jaggedArray[2] = new int[] { 6, 7, 8, 9 };
    
    // Accessing Elements in a Jagged Array
    Console.WriteLine("Element at (1,2): " + jaggedArray[1][2]); // Output: 5
    ```
    

## **Array Manipulation Techniques**

- **`Array.Resize`**: Changing the size of an array.
- **`Array.Copy`**: Copying elements from one array to another.
- **`Array.Sort`**: Sorting an array.
- **`Array.Reverse`**: Reversing the order of elements.
    
    ```csharp
    // Resizing an Array
    int[] numbers = { 1, 2, 3, 4, 5 };
    Array.Resize(ref numbers, 7); // Resize to 7 elements
    numbers[5] = 6;
    numbers[6] = 7;
    
    // Copying an Array
    int[] copiedArray = new int[5];
    Array.Copy(numbers, copiedArray, 5);
    
    // Sorting an Array
    Array.Sort(copiedArray); // Sort in ascending order
    
    // Reversing an Array
    Array.Reverse(copiedArray); // Reverse the order
    
    // Output the manipulated array
    Console.WriteLine("Manipulated Array: " + string.Join(", ", copiedArray));
    ```
    

## **Algorithms Related to Arrays**

- **Linear Search**: Searching for an element by checking each element in the array.
- **Binary Search**: Searching for an element in a sorted array using a divide-and-conquer approach.
- **Bubble Sort**: Sorting an array by repeatedly swapping adjacent elements if they are in the wrong order.
- **Quick Sort**: An efficient, divide-and-conquer sorting algorithm.

**Example Code in C#:**

### [**Linear Search**](https://www.notion.so/Array-464904d9c02e4a15b8708dfa3ae089c9?pvs=21)

```csharp
int LinearSearch(int[] arr, int target)
{
    for (int i = 0; i < arr.Length; i++)
    {
        if (arr[i] == target)
        {
            return i; // Target found
        }
    }
    return -1; // Target not found
}

int[] array = { 1, 3, 5, 7, 9 };
int index = LinearSearch(array, 7); // Output: 3
Console.WriteLine("Linear Search Index: " + index);
```

### [**Binary Search**](https://www.notion.so/Array-464904d9c02e4a15b8708dfa3ae089c9?pvs=21)

```csharp
int BinarySearch(int[] arr, int target)
{
    int left = 0;
    int right = arr.Length - 1;
    while (left <= right)
    {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target)
            return mid; // Target found
        else if (arr[mid] < target)
            left = mid + 1; // Search right half
        else
            right = mid - 1; // Search left half
    }
    return -1; // Target not found
}

int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
index = BinarySearch(sortedArray, 6); // Output: 5
Console.WriteLine("Binary Search Index: " + index);

```

### [**Bubble Sort**](https://www.notion.so/Array-464904d9c02e4a15b8708dfa3ae089c9?pvs=21)

```csharp
void BubbleSort(int[] arr)
{
    int n = arr.Length;
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int[] unsortedArray = { 64, 25, 12, 22, 11 };
BubbleSort(unsortedArray);
Console.WriteLine("Bubble Sorted Array: " + string.Join(", ", unsortedArray));

```

### [**Quick Sort**](https://www.notion.so/Array-464904d9c02e4a15b8708dfa3ae089c9?pvs=21)

```csharp
void QuickSort(int[] arr, int low, int high)
{
    if (low < high)
    {
        int pi = Partition(arr, low, high);
        QuickSort(arr, low, pi - 1); // Sort elements before partition
        QuickSort(arr, pi + 1, high); // Sort elements after partition
    }
}

int Partition(int[] arr, int low, int high)
{
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j <= high - 1; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp1 = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp1;
    return (i + 1);
}

int[] quickSortArray = { 10, 7, 8, 9, 1, 5 };
QuickSort(quickSortArray, 0, quickSortArray.Length - 1);
Console.WriteLine("Quick Sorted Array: " + string.Join(", ", quickSortArray));

```

---

# What is a Jagged Array?

A Jagged Array is an array of arrays, where each "row" in the array can have a different number of elements. This contrasts with a multi-dimensional array, where each row and column must have the same number of elements.

### Key Concepts:

- **Declaration and Initialization**: Understanding how to declare and initialize a jagged array.
    
    ```csharp
    // Declaration of a Jagged Array with 3 rows
    int[][] jaggedArray = new int[3][];
    
    // Initializing each row with different sizes
    jaggedArray[0] = new int[2]; // First row has 2 elements
    jaggedArray[1] = new int[3]; // Second row has 3 elements
    jaggedArray[2] = new int[4]; // Third row has 4 elements
    
    // Assigning values to the elements
    jaggedArray[0][0] = 1;
    jaggedArray[0][1] = 2;
    
    jaggedArray[1][0] = 3;
    jaggedArray[1][1] = 4;
    jaggedArray[1][2] = 5;
    
    jaggedArray[2][0] = 6;
    jaggedArray[2][1] = 7;
    jaggedArray[2][2] = 8;
    jaggedArray[2][3] = 9;
    
    ```
    
    ```csharp
    csharpCopy code
    // Declaration and Initialization in one step
    int[][] predefinedJaggedArray =
    {
        new int[] { 1, 2 },
        new int[] { 3, 4, 5 },
        new int[] { 6, 7, 8, 9 }
    };
    
    ```
    
- **Accessing Elements**: How to access and manipulate individual elements within a jagged array.
    
    ```csharp
    // Accessing the first element of the first row
    Console.WriteLine("First element of first row: " + predefinedJaggedArray[0][0]); // Output: 1
    
    // Accessing the last element of the last row
    Console.WriteLine("Last element of last row: " + predefinedJaggedArray[2][3]); // Output: 9
    
    ```
    
- **Traversing Jagged Arrays**: Iterating through a jagged array using loops.
    
    ```csharp
    // Traversing a Jagged Array using nested loops
    for (int i = 0; i < predefinedJaggedArray.Length; i++) // Loop through rows
    {
        Console.Write("Row " + i + ": ");
        for (int j = 0; j < predefinedJaggedArray[i].Length; j++) // Loop through elements in each row
        {
            Console.Write(predefinedJaggedArray[i][j] + " ");
        }
        Console.WriteLine();
    }
    ```
    
    Output of the Above Traversal:
    
    ```mathematica
    Row 0: 1 2
    Row 1: 3 4 5
    Row 2: 6 7 8 9
    ```
    

### Next Steps:

- **Exercise**: Write a C# program to create a jagged array with 4 rows, where each row's length is determined by the user. Populate the array with user input and display the entire jagged array.
- **Additional Exploration**: Learn how to use jagged arrays for more complex data structures, like adjacency lists in graph representations.

# What is Linear Search?

Linear Search is a straightforward searching algorithm that checks each element in an array sequentially until the desired element is found or the end of the array is reached.

- **Sequential Checking**: Each element is checked one by one.
- **Time Complexity**: O(n), where n is the number of elements in the array. This means that in the worst case, you might have to check every element.

**How Linear Search Works:**

1. Start from the first element.
2. Compare the current element with the target value.
3. If a match is found, return the index.
4. If no match is found by the end of the array, return -1 (indicating that the target is not in the array).

**Example Code in C#:**

```csharp
using System;

class Program
{
    // Linear Search Function
    static int LinearSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.Length; i++)
        {
            if (arr[i] == target)
            {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }

    static void Main()
    {
        int[] numbers = { 1, 3, 5, 7, 9, 11 };
        int target = 7;

        int index = LinearSearch(numbers, target);

        if (index != -1)
        {
            Console.WriteLine("Target found at index: " + index); // Output: Target found at index: 3
        }
        else
        {
            Console.WriteLine("Target not found.");
        }
    }
}

```

**Explanation:**

- **Function Definition**: `LinearSearch(int[] arr, int target)` takes an array and a target value as input.
- **Loop Through Array**: The `for` loop checks each element.
- **Comparison**: If the current element matches the target, the function returns the index.
- **Not Found**: If the loop completes without finding the target, the function returns -1.

### Next Steps:

- **Exercise**: Implement a linear search algorithm that handles both integer and string arrays. Test it with various data sets.
- **Additional Exploration**: Compare Linear Search with other searching algorithms, such as Binary Search, to understand the differences in performance.

# What is Binary Search?

Binary Search is an efficient searching algorithm used on sorted arrays. It repeatedly divides the search interval in half, checking if the target value is in the left or right half of the array, until the target is found or the interval is empty.

- **Sorted Array**: Binary Search only works on arrays that are sorted in ascending or descending order.
- **Divide and Conquer**: The array is divided into halves, reducing the search space each time.
- **Time Complexity**: O(log n), where n is the number of elements in the array. This is much more efficient than Linear Search for large arrays.

**How Binary Search Works:**

1. Start with two pointers: `low` and `high` (initially set to the start and end of the array).
2. Find the middle index: `mid = (low + high) / 2`.
3. Compare the target value with the middle element.
4. If the target is equal to the middle element, return the index.
5. If the target is less than the middle element, adjust the `high` pointer to `mid - 1`.
6. If the target is greater than the middle element, adjust the `low` pointer to `mid + 1`.
7. Repeat until the target is found or the `low` pointer exceeds the `high` pointer.

**Example Code in C#:**

```csharp
using System;

class Program
{
    // Binary Search Function
    static int BinarySearch(int[] arr, int target)
    {
        int low = 0;
        int high = arr.Length - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
            {
                return mid; // Target found at index mid
            }
            else if (arr[mid] < target)
            {
                low = mid + 1; // Search in the right half
            }
            else
            {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    static void Main()
    {
        int[] sortedNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;

        int index = BinarySearch(sortedNumbers, target);

        if (index != -1)
        {
            Console.WriteLine("Target found at index: " + index); // Output: Target found at index: 5
        }
        else
        {
            Console.WriteLine("Target not found.");
        }
    }
}
```

**Explanation:**

- **Function Definition**: `BinarySearch(int[] arr, int target)` takes a sorted array and a target value.
- **Pointer Initialization**: `low` and `high` define the search range.
- **Middle Index Calculation**: `mid` is used to check the middle element of the current range.
- **Comparison**: Depending on whether the target is less than or greater than the middle element, the search range is adjusted.
- **Loop Continuation**: The process continues until the target is found or the range is exhausted.

### Next Steps:

- **Exercise**: Implement Binary Search for a sorted array of strings. Ensure to handle cases where the target is not found.
- **Additional Exploration**: Compare Binary Search with Linear Search in terms of performance for different sizes of data sets.

# What is Bubble Sort?

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

- **Adjacent Comparisons**: Compares and potentially swaps adjacent elements.
- **Multiple Passes**: Continues making passes through the list until no swaps are needed.
- **Time Complexity**: O(n^2), where n is the number of elements. This makes Bubble Sort less efficient for large datasets compared to more advanced sorting algorithms.

**How Bubble Sort Works:**

1. Start with the first element and compare it with the next element.
2. If the current element is greater than the next element, swap them.
3. Continue this process for the entire array.
4. After each pass, the largest unsorted element "bubbles up" to its correct position.
5. Repeat the process for the remaining unsorted portion of the array until the entire array is sorted.

**Example Code in C#:**

```csharp
using System;

class Program
{
    // Bubble Sort Function
    static void BubbleSort(int[] arr)
    {
        int n = arr.Length;
        for (int i = 0; i < n - 1; i++)
        {
            // Track if any swapping happened in this pass
            bool swapped = false;

            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is sorted
            if (!swapped)
                break;
        }
    }

    static void Main()
    {
        int[] unsortedArray = { 64, 25, 12, 22, 11 };

        Console.WriteLine("Original Array: " + string.Join(", ", unsortedArray));

        BubbleSort(unsortedArray);

        Console.WriteLine("Sorted Array: " + string.Join(", ", unsortedArray));
    }
}

```

**Explanation:**

- **Function Definition**: `BubbleSort(int[] arr)` sorts the input array in ascending order.
- **Outer Loop**: Runs for `n - 1` passes, where `n` is the number of elements in the array.
- **Inner Loop**: Compares adjacent elements and swaps them if necessary. The range of comparison reduces with each pass as the largest elements move to the end.
- **Swapping Check**: The `swapped` flag helps to optimize the algorithm by stopping early if no swaps were made in a pass.

### Next Steps:

- **Exercise**: Implement Bubble Sort for an array of floating-point numbers and verify its correctness.
- **Additional Exploration**: Compare Bubble Sort with other sorting algorithms, like Quick Sort or Merge Sort, in terms of performance and efficiency.

# What is Quick Sort?

Quick Sort is an efficient, divide-and-conquer sorting algorithm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

- **Pivot Selection**: A pivot element is chosen to divide the array into two partitions.
- **Partitioning**: Rearranging elements so that elements less than the pivot are on one side, and elements greater than the pivot are on the other side.
- **Recursion**: The algorithm is applied recursively to the sub-arrays.
- **Time Complexity**: O(n log n) on average, but O(n^2) in the worst case if the pivot selection is poor. (e.g., always choosing the smallest or largest element).

**How Quick Sort Works:**

1. **Choose a Pivot**: Select an element from the array to act as the pivot. Common choices include the first element, the last element, or a random element.
2. **Partitioning**: Rearrange elements such that elements less than the pivot are on one side and elements greater than the pivot are on the other.
3. **Recursion**: Apply Quick Sort recursively to the sub-arrays formed by the partitioning.
4. **Combine**: The array becomes sorted as the sub-arrays are sorted independently.

**Example Code in C#:**

```csharp
using System;

class Program
{
    // Quick Sort Function
    static void QuickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            // Partition the array
            int pi = Partition(arr, low, high);

            // Recursively sort the sub-arrays
            QuickSort(arr, low, pi - 1); // Before pivot
            QuickSort(arr, pi + 1, high); // After pivot
        }
    }

    // Partition Function
    static int Partition(int[] arr, int low, int high)
    {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp1 = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp1;

        return i + 1;
    }

    static void Main()
    {
        int[] unsortedArray = { 10, 7, 8, 9, 1, 5 };

        Console.WriteLine("Original Array: " + string.Join(", ", unsortedArray));

        QuickSort(unsortedArray, 0, unsortedArray.Length - 1);

        Console.WriteLine("Sorted Array: " + string.Join(", ", unsortedArray));
    }
}

```

**Explanation:**

- **`QuickSort` Function**: Sorts the array between indices `low` and `high`.
- **Partition Function**: Rearranges elements around the pivot, placing elements less than the pivot to the left and those greater to the right.
- **Recursion**: The `QuickSort` function is called recursively on the sub-arrays.

### Next Steps:

- **Exercise**: Implement Quick Sort to sort an array of strings. Test the implementation with different string arrays.
- **Additional Exploration**: Experiment with different pivot selection strategies (e.g., first element, random element) to understand their impact on performance.