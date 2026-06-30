package Day_8.ClassTask;
import java.util.Scanner;
public class PrintName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        for(int i =0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
