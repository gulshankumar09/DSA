import java.util.Scanner;

class StarProblem {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter value of n :");
        int n = sc.nextInt();
        sc.close();
        for(int i=0; i<n+1; i++){
            for(int j= 0; j<i; j++){
                System.out.print("*" + " ");

            }
            System.out.println();
        }
    }
}