import java.util.Scanner;

public class PartitionArray2 {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int arraySum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean partitionArray(int arr[]) {
        int totalSum = arraySum(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrray : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " values in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println("Partition is possible : " + partitionArray(arr));
        sc.close();
    }
}
