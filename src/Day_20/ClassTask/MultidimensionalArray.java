package Day_20.ClassTask;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 9, 0},
                {4, 8, 9, 0}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
