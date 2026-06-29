package Day_7.HomeWork;

public class ReplaceNegative {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -8, 30};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                arr[i] = 0;
        }
        System.out.print("Modified Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}