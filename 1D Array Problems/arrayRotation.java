import java.util.Scanner;

public class arrayRotation {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] rotateArray(int arr[], int k) {
        int n = arr.length, i, j = 0;
        int ans[] = new int[n];
        for (i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.print("Enter the rotation time : ");
        int k = sc.nextInt();
        k = k % arr.length;

        System.out.print("Before rotation : ");
        printArray(arr);
        int ans[] = rotateArray(arr, k);
        System.out.print("After rotation : ");
        printArray(ans);

        sc.close();
    }
}
