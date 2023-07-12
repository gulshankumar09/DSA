public class Recursion {
    public static void main(String[] args) {
        printInc(5);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sumNaturalNo(5));
        System.out.println(fibonacci(5));

        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        allOccurance(arr, key, 0);
    }

    // Print no. from n to 1 (increasing order)
    // 1 2 3 4 5
    // f(n) = f(n-1)+ n
    public static void printInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }

        printInc(n-1);
        System.out.print(n + " ");
    }

    //print factorial of n ,    fn = n * f(n-1)
    public static int factorial(int n){
        if (n==1 || n== 0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
        return fn;
    }

    //find the sum of n natural no.
    public static int sumNaturalNo(int n){
        if(n==1){
            return 1;
        }
        int fnm1 = sumNaturalNo(n-1);
        int fn = n + fnm1;
        return fn;
    }

    //find nth fibonacci number
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);

        int fn = fnm1 + fnm2;
        return fn;

    }

    // find the first occurance

    public static int firstOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
        
    }

    // find the all occurance for the key
    public static void allOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        allOccurance(arr, key, i+1);
        
    }

}
