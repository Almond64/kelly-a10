/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Paul Kelly
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
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
        System.out.printf("Subtotal: $%s\n", df.format(subtotal));
        //calculate tax
        double tax = subtotal * 0.055;
        System.out.printf("Tax: $%s\n", df.format(tax));
        //calculate total
        double total = subtotal + tax;
        System.out.printf("Total: $%s\n", df.format(total));
    }
}
