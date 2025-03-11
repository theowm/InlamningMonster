package com.wigell;

import com.wigell.BusinessObjects.*;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Lyssnare på när produktionen börjas
        ProductionObserver productionObserver = new ProductionObserver();
        OrderObserver orderObserver = new OrderObserver();
        Receipt receipt = new Receipt();
        Order order = new Order();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your full name?");
        String name = scanner.nextLine();
        System.out.println("What is your address?");
        String adress = scanner.nextLine();
        System.out.println("What is your mail?");
        String mail = scanner.nextLine();

        Customer customer = new Customer(name, adress, mail);

        System.out.println("Hello! What would you like to order?");
        System.out.println("1. Pants");
        System.out.println("2. T-Shirt");
        System.out.println("3. Skirt");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                order.processPantsOrder(scanner, customer, receipt);
                break;
            case 2:
                order.processTShirtOrder(scanner, customer, receipt);
                break;
            case 3:
                order.processSkirtOrder(scanner, customer, receipt);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

    }
}
