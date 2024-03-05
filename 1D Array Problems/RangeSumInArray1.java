import java.util.Scanner;

public class RangeSumInArray1 {
    static void printArray(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int rangeSum(int arr[], int s, int e) {
        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];

        System.out.println("Enter elements in the array ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);

        System.out.println("Enter the number of queries : ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("\nEnter the range for " + i + " query sum");
            System.out.print("Start : ");
            int start = sc.nextInt();
            System.out.print("End : ");
            int end = sc.nextInt();

            System.out.println("Sum of array element in given range : " + rangeSum(arr, start, end));
        }

        sc.close();
    }
}
