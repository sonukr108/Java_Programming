//Find unique digit in the array which is not twice and all element are must be twice
public class UniqueDigit {
    static int uniqueDigit(int arr[]) {
        int a = -1, n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                a = arr[i];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 2, 3, 3, 4, 1, 5, 72 };
        System.out.println(uniqueDigit(arr));
    }
}
