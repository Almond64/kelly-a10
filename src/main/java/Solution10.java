import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        int price1 = input.nextInt();
        System.out.println("Enter the quantity of item 1: ");
        int q1 = input.nextInt();
        System.out.println("Enter the price of item 2: ");
        int price2 = input.nextInt();
        System.out.println("Enter the quantity of item 2:");
        int q2 = input.nextInt();
        System.out.println("Enter the price of item 3: ");
        int price3 = input.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        int q3 = input.nextInt();
        //calculate subtotal
        double subtotal = (price1*q1) + (price2*q2) + (price3*q3);
        System.out.printf("Subtotal: $%f\n", subtotal);
        //calculate tax
        double tax = subtotal * 0.055;
        System.out.printf("Tax: $%f\n", tax);
        //calculate total
        double total = subtotal + tax;
        System.out.printf("Total: $%f\n", total);
    }
}
