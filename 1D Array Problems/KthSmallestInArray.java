import java.util.Scanner;

public class KthSmallestInArray {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int kthSmallest(int arr[], int k) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == min) {
                    arr[j] = Integer.MAX_VALUE;
                }
            }
            min = findMin(arr);
        }

        return min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " values in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Given array is : ");
        printArray(arr);

        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        if (k > n && k <= 0 ) {
            System.out.println("Your choice is greter then array size");
        } else {
            System.out.println("The " + k + "th smallest value in given array : " + kthSmallest(arr, k));
        }
        sc.close();
    }
}
