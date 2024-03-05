//Find second largest number from an array
public class SecondGretest {
    static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int arr[]) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondmax = findMax(arr);
        return secondmax;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 8, 7, 2, 5, 45, 4, 5, 53, 55 };
        System.out.println(findSecondMax(arr));
    }
}
