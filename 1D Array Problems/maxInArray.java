public class maxInArray {
    public static void main(String[] args) {
        int max = 0, i, arr[] = { 14, 10, 45, 1, 335, 154, 1, 2, 55, 5 };
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value in array is : " + max);
    }
}
