import java.util.Scanner;

public class RectangleSumInMatrix1 {
    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method 1 : Brute force
    static int findBoundriesSum(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
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