package Day_8.HomeTask;

import java.util.Scanner;
public class Parallel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] drinks = {"Pepsi", "Sprite", "Maaza", "Coke", "Campa"};
        int [] prices = {40, 20, 45, 40, 10};
        int [] stock = {10,5,8,12,3};
        System.out.println("Pepsi,Sprite,Maaza,Coke,Campa");
        System.out.print("Enter the name of the drink:");
        String name = sc.nextLine();
        System.out.print("Enter the quantity:");
        int qty = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < drinks.length; i++) {
            if (name.equalsIgnoreCase(drinks[i])) {
                found = true;
                if (stock[i] < qty) {
                    System.out.println("out of stock");
                } else {
                    System.out.println("Total Price: " + (prices[i] * qty));
                    stock[i] -= qty;
                    System.out.println("Remaining stock for " + drinks[i] + ": " + stock[i]);
                }
                break;
            }
        }
            if (!found) {
                System.out.print("Drink not found in the menu.");
            }
            sc.close();
    }

}
