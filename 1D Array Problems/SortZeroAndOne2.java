import java.util.Scanner;

public class SortZeroAndOne2 {

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapArrayElement(int arr[], int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    static void SortZeroesAndOnes(int arr[]) {
        int n = arr.length;
        int right = n - 1;
        int left = 0;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapArrayElement(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of the array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " values in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Sorting : ");
        printArray(arr);
        SortZeroesAndOnes(arr);
        System.out.print("After Sorting : ");
        printArray(arr);
        sc.close();
    }
}
