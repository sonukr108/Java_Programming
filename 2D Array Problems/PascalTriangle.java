import java.util.Scanner;

public class PascalTriangle {
    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] pascalTriangle(int n) {
        int p[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            p[i] = new int[i+1];
            // 1st and last element is zero
            p[i][0] = p[i][i] = 1;
            for (int j = 1; j < i; j++) {
                p[i][j] = p[i - 1][j] + p[i - 1][j - 1];
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pascal triangle : ");
        int n = sc.nextInt();

        int pascal[][] = pascalTriangle(n);
        print2DArray(pascal);

        sc.close();
    }
}
