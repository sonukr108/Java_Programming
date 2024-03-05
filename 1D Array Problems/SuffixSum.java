import java.util.Scanner;

public class SuffixSum {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void suffixSumInArray(int arr[]) {
        for (int i = arr.length-2; i >= 0; i--) {
            arr[i] += arr[i+1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " values in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before suffix sum in array : ");
        printArray(arr);
        suffixSumInArray(arr);
        System.out.print("After suffix sum in array : ");
        printArray(arr);

        sc.close();
    }
}
