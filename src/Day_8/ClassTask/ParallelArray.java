package Day_8.ClassTask;

import java.util.Scanner;
public class ParallelArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] drinks = {"Pepsi", "Sprite", "Maaza", "Coke", "Campa"};
        int [] prices = {40, 20, 45, 40, 10};
        System.out.println("Pepsi,Sprite,Maaza,Coke,Campa");
        System.out.print("Enter the name of the drink:");
        String name = sc.nextLine();
        System.out.print("Enter the quantity:");
        int qty = sc.nextInt();
        for (int i = 0; i < drinks.length; i++) {
            if (name.equals(drinks[i])) {
                System.out.print(prices[i] * qty);
            }
        }
    }

}
