import java.util.Scanner;

public class ReverseSpiralOrderTraversal {
    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] createSpiralMatrix(int n) {
        int matrix[][] = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int count = 1;
        while (count <= n * n) {
            // Top row -> left column to right column
            for (int j = topRow; j <= rightCol && count <= n * n; j++) {
                matrix[topRow][j] = count++;
            }
            topRow++;

            // Right column -> top row to bottom row
            for (int i = topRow; i <= bottomRow && count <= n * n; i++) {
                matrix[i][rightCol] = count++;
            }
            rightCol--;

            // Bottom row -> right column to left column
            for (int j = rightCol; j >= leftCol && count <= n * n; j--) {
                matrix[bottomRow][j] = count++;
            }
            bottomRow--;

            // Left column -> bottom row to top row
            for (int i = bottomRow; i >= topRow && count <= n * n; i--) {
                matrix[i][leftCol] = count++;
            }
            leftCol++;
        }

        return matrix;
    }

    static void spiralReverseOrderTraversal(int arr[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int total = 0;
        int arr1[] = new int[r*c];
        int k = 0;
        while (total < r*c) {
            //Top row ->  left column to right column
            for (int j = leftCol; j <= rightCol && total < r*c; j++) {
                arr1[k++] = arr[topRow][j];
                total++;
            }
            topRow++;

            //Right Column -> Top row to Bottom row
            for (int i = topRow; i <= bottomRow && total < r*c; i++) {
                arr1[k++] = arr[i][rightCol];
                total++;
            }
            rightCol--;

            //Bottom row -> right column to left left column
            for (int j = rightCol; j >= leftCol && total < r*c; j--) {
                arr1[k++] = arr[bottomRow][j];
                total++;
            }
            bottomRow--;

            //Left Column -> bottom row to top row
            for (int i = bottomRow; i >= topRow && total < r*c; i--) {
                arr1[k++] = arr[i][leftCol];
                total++;
            }
            leftCol++;
        }

        for (int i = arr1.length -1 ; i >=0 ; i--) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of spiral square matrix : ");
        int n = sc.nextInt();

        // Creating spiral matrix
        int matrix[][] = createSpiralMatrix(n);

        // Printing spiral matrix
        System.out.println("\nSpiral matrix as our input is");
        print2DArray(matrix);

        System.out.print("\nReverse spiral order traversal : ");
        spiralReverseOrderTraversal(matrix, n, n);


        sc.close();
    }
}
