package Day_22.ClassTask;

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int arr [] ={1,2,3,5,4};
        System.out.println(Arrays.toString(InsertionSort(arr)));
    }
    public static int [] InsertionSort(int [] arr){
        // need to start from the second element
        // start moving the element to the left until it is moving towards left
        int n =arr.length;
        // // need to start from the second element
        for (int i =1; i<arr.length;i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;

    }

}