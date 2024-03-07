import java.util.Scanner;

// Reverse each row in any matrix
public class ReverseEachRowMatrix {
    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void reverseArray(int arr[]) {
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            arr[a] = arr[a] + arr[b];
            arr[b] = arr[a] - arr[b];
            arr[a] = arr[a] - arr[b];
            a++;
            b--;
        }
    }

    static void reverseEachRowMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            reverseArray(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " value in matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Before reversing");
        print2DArray(arr);
        reverseEachRowMatrix(arr);
        System.out.println("After reversing");
        print2DArray(arr);

        sc.close();
    }
}
