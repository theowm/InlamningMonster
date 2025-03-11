package com.wigell.BusinessObjects;

public class Receipt {

    public void printPantsReceipt(Customer customer, Pants pants) {

        System.out.println("Receipt:");
        System.out.println("-------");
        System.out.println("Pants");
        System.out.println("Name: " + customer.getName());
        System.out.println("Mail: " + customer.getMail());
        System.out.println("Adress: " + customer.getAddress());
        System.out.println("-------");
        System.out.println("Material: " + pants.getMaterial());
        System.out.println("Size: " + pants.getSize());
        System.out.println("Color : " + pants.getColor());
        System.out.println("Fit: " + pants.getFit());
        System.out.println("Lenght: " + pants.getLenght());
        System.out.println("-------");
        System.out.println("Price: " + pants.getPrice() + "kr");
    }

    public void printTshirtReceipt(Customer customer, TShirt tshirt) {

        System.out.println("Receipt:");
        System.out.println("-------");
        System.out.println("T-Shirt");
        System.out.println("Name: " + customer.getName());
        System.out.println("Mail: " + customer.getMail());
        System.out.println("Adress: " + customer.getAddress());
        System.out.println("-------");
        System.out.println("Material: " + tshirt.getMaterial());
        System.out.println("Size: " + tshirt.getSize());
        System.out.println("Color : " + tshirt.getColor());
        System.out.println("Neck type: " + tshirt.getNeck());
        System.out.println("Sleeve type: " + tshirt.getSleeves());
        System.out.println("-------");
        System.out.println("Price: " + tshirt.getPrice () + "kr");
    }

    public void printSkirtReceipt(Customer customer, Skirt skirt) {

        System.out.println("Receipt:");
        System.out.println("-------");
        System.out.println("Skirt");
        System.out.println("Name: " + customer.getName());
        System.out.println("Mail: " + customer.getMail());
        System.out.println("Adress: " + customer.getAddress());
        System.out.println("-------");
        System.out.println("Material: " + skirt.getMaterial());
        System.out.println("Size: " + skirt.getSize());
        System.out.println("Color : " + skirt.getColor());
        System.out.println("Waist: " + skirt.getWaistline());
        System.out.println("Pattern: " + skirt.getPattern());
        System.out.println("-------");
        System.out.println("Price: " + skirt.getPrice() + "kr");
    }

    public Receipt() {
    }
}
