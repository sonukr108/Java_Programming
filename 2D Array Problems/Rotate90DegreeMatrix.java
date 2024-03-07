import java.util.Scanner;

public class Rotate90DegreeMatrix {
    static void print2Darray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] transposeMatrix(int arr[][], int r, int c) {
        int t[][] = new int[c][r];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = arr[j][i];
            }
        }
        return t;
    }
    static void reverseArray(int arr[]){
        int a = 0, b = arr.length - 1;
        while (a<b) {
            arr[a] = arr[a] + arr[b];
            arr[b] = arr[a] - arr[b];
            arr[a] = arr[a] - arr[b];
            a++;
            b--;
        }
    }

    static int[][] rotateMatrix(int arr[][], int r, int c){
        int t[][] = transposeMatrix(arr, r, c);
        for (int i = 0; i < t.length; i++) {
            reverseArray(t[i]);
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for matrix");
        int r = sc.nextInt(), c = sc.nextInt(), arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " values in array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nYour matrix is");
        print2Darray(arr);
        rotateMatrix(arr, r, c);
        int t[][] = rotateMatrix(arr, r, c);
        System.out.println("Transpose matrix is");
        print2Darray(t);
        sc.close();
    }
}
