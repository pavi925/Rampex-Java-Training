package Day_22.ClassTask;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        bubblesort(arr);
    }
    public static void bubblesort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}