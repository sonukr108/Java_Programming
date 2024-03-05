import java.util.Scanner;

public class KthGretestInArray {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int kthGretest(int arr[], int k) {
        int max;
        do {
            max = findMax(arr);
            for (int j = 0; j < arr.length; j++) {
                if (max == arr[j]) {
                    arr[j] = Integer.MIN_VALUE;
                }
            }
            k--;
        } while (k >= 1);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + "th values in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.print("Enter value of k : ");
        int k = sc.nextInt();
        if (k > n && k <= 0 ) {
            System.out.println("Your choice is greter then array size");
        } else {
            System.out.println("The " + k + " gretest value in given array : " + kthGretest(arr, k));
        }
        sc.close();
    }
}