import java.util.Scanner;

public class AddTwoMatrices {
    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void matrixSum(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Summation is not possible ! Wrong dimensions");
            return;
        }
        int sum[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of given matrices");
        print2DArray(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter details for 1st matrix
        System.out.println("Enter row and column for 1st matrix ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter " + r1 * c1 + " elements in the array");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Enter details for 2nd matrix
        System.out.println("Enter row and column for 2nd matrix ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter " + r2 * c2 + " elements in the array");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("1st matrix is ");
        print2DArray(a);
        System.out.println("2nd matrix is");
        print2DArray(b);
        matrixSum(a, r1, c1, b, r2, c2);
        sc.close();
    }
}
