import java.util.Scanner;

public class MultiplyTwoMatrices {
    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void matrixMultiplication(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication is not possible !  Invalid input");
            return;
        }
        // Creating array for multiplication
        int mul[][] = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    /*
                     * When i = 0 and j = 0 and k = 0
                     * then mul[0][0] = mul[0][0] + (a[0][0] * b[0][0])
                     * 
                     * When i = 0 and j = 0 and k = 1
                     * then mul[0][0] = mul[0][0] + (a[0][1] * b[1][0])
                     * 
                     * When i = 0 and j = 0 and k = 2
                     * then mul[0][0] = mul[0][0] + (a[0][2] * b[2][0])
                     * 
                     */
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplaction of given matrix is ");
        print2DArray(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the datails of 1st matrix
        System.out.println("Enter number of rows and colums for 1st matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter " + r1 * c1 + " elements in array");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Enter the datails of 2nd matrix
        System.out.println("Enter number of rows and colums for 2nd matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter " + r2 * c2 + " elements in array");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("1st matrix is");
        print2DArray(a);

        System.out.println("2nd matrix is");
        print2DArray(b);

        matrixMultiplication(a, r1, c1, b, r2, c2);

        sc.close();
    }
}
