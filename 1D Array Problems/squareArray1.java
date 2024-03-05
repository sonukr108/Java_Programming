import java.util.Scanner;

public class squareArray1 {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void squareArray(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = arr.length - 1;
        int ans[] = new int[n];
        int i = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[i++] = arr[left] * arr[left];
                left++;
            } else {
                ans[i++] = arr[right] * arr[right];
                right--;
            }
        }
        int j = n-1;
        for (i = 0; i < n; i++) {
            arr[i] = ans[j--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before squring array :");
        printArray(arr);

        squareArray(arr);

        System.out.print("After squring array :");
        printArray(arr);

        sc.close();
    }
}
