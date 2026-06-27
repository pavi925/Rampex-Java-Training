package Day_7.ClassWork;

import java.util.Scanner;
public class SumArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 0;i<5;i++){
            sum += i;
        }
        System.out.println("Sum:" + sum);
    }
}
