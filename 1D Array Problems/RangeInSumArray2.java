import java.util.Scanner;

public class RangeInSumArray2 {
    static void printArray(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void prefixSum(int arr[]) {
        for (int i = 2; i <= arr.length - 1; i++) {
            arr[i] += arr[i - 1];
        }
    }

    static int findSum(int arr[], int l, int r) {

        int sum = 0;
        sum = arr[r] - arr[l - 1];
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        System.out.println("Enter " + n + " values in the array");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        prefixSum(arr);

        System.out.print("Enter the number of quries : ");
        int q = sc.nextInt();

        int i = 1;
        while (q-- > 0) {
            System.out.println("\nEnter start and end index for " + i++ + " query");
            System.out.print("Start : ");
            int l = sc.nextInt();
            System.out.print("End : ");
            int r = sc.nextInt();
            System.out.println("Sum of elements in the given range : " + findSum(arr, l, r));
        }

        // printArray(arr);
        sc.close();
    }
}
