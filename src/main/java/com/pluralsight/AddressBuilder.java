package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        builder.append(scanner.nextLine());

        builder.append("\n\nBilling Address: \n");
        System.out.print("\nBilling Street: ");
        builder.append(scanner.nextLine()).append("\n");
        System.out.print("Billing City: ");
        builder.append(scanner.nextLine()).append(", ");
        System.out.print("Billing State: ");
        builder.append(scanner.nextLine()).append(" ");
        System.out.print("Billing Zip: ");
        builder.append(scanner.nextLine());

        builder.append("\n\nShipping Address: \n");
        System.out.print("\nShipping Street: ");
        builder.append(scanner.nextLine()).append("\n");
        System.out.print("Shipping City: ");
        builder.append(scanner.nextLine()).append(", ");
        System.out.print("Shipping State: ");
        builder.append(scanner.nextLine()).append(" ");
        System.out.print("Shipping Zip: ");
        builder.append(scanner.nextLine());

        System.out.println(builder);
    }
}
