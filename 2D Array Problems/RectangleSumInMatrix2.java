import java.util.Scanner;

public class RectangleSumInMatrix2 {
    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void prefixSummatrix(int arr[][]){
        int r = 0;
        int c = arr[0].length;
        // Traverse in each row and find prefixSum horizontally
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j-1]; 
            }
        }
    }
    // Method 2 : Pre calculating the horizontal sum for each row in matrix
    static int findBoundriesSum(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        prefixSummatrix(arr);
        // r1 to r2 sum of row i
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += arr[i][r2] - arr[i][r1-1];
            }
            else{
                sum += arr[i][r2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns for matrix");
        int r = sc.nextInt(), c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " values in the matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter boundries l1, r1, l2, r2");
        int l1 = sc.nextInt(), r1 = sc.nextInt(), l2 = sc.nextInt(), r2 = sc.nextInt();

        System.out.println("\nYour matrix is");
        print2DArray(arr);

        System.out.println("Sum of elements in given boundries : " + findBoundriesSum(arr, l1, r1, l2, r2));

        sc.close();
    }
}