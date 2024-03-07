import java.util.Scanner;

public class SpiralOrderTraversal {
    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void spiralOrderTraversal(int arr[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int total = 0;
        while (total < r*c) {
            //Top row ->  left column to right column
            for (int j = leftCol; j <= rightCol && total < r*c; j++) {
                System.out.print(arr[topRow][j] + " ");
                total++;
            }
            topRow++;

            //Right Column -> Top row to Bottom row
            for (int i = topRow; i <= bottomRow && total < r*c; i++) {
                System.out.print(arr[i][rightCol] + " ");
                total++;
            }
            rightCol--;

            //Bottom row -> right column to left left column
            for (int j = rightCol; j >= leftCol && total < r*c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                total++;
            }
            bottomRow--;

            //Left Column -> bottom row to top row
            for (int i = bottomRow; i >= topRow && total < r*c; i--) {
                System.out.print(arr[i][leftCol] + " ");
                total++;
            }
            leftCol++;
        }
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
        System.out.println("\nYour matrix is");
        print2DArray(arr);
        System.out.println("Spiral order traversal");
        spiralOrderTraversal(arr, r, c);

        sc.close();
    }
}
