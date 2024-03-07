import java.util.Scanner;

public class RectangleSumInMatrix3 {
    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void prefixSumMatrix(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        // traverse horizontally to calculate row-wise prefix sum
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }

        //traverse vertically to calculate column-wise sum
        for(int j = 0; j < c; j++){ // fixing column
            for(int i = 1; i < r; i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }
    // Method 2 : Pre calculating the horizontal sum for each row in matrix
    static int findBoundriesSum(int arr[][], int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        prefixSumMatrix(arr);
        // print2DArray(arr);

        sum = arr[l2][r2];
        if(r1 >= 1) {
            left = arr[l2][r1 - 1];
        }
        if(l1 >= 1) {
            up = arr[l1 - 1][r2];
        }
        if(l1 >=1 && r1 >= 1) {
            leftUp = arr[l1 - 1][r1 - 1];
        }
        ans = sum - up - left + leftUp;
        return ans;
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