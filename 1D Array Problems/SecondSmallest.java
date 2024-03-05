//Find second smallest number from an array
public class SecondSmallest {
    static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findSecondMin(int arr[]) {
        int min = findMin(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }

        int secondmin = findMin(arr);
        return secondmin;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 1, 5, 7, 8, 7, 2, 5, 45, 4, 5, 53, 55 };
        System.out.println(findSecondMin(arr));
    }
}
