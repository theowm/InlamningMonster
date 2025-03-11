package com.wigell.BusinessObjects;

import com.wigell.Command.*;
import com.wigell.ProductionObserver;
import com.wigell.builder.PantsBuilder;
import com.wigell.builder.SkirtBuilder;
import com.wigell.builder.TShirtBuilder;

import java.util.Scanner;

public class Order {

    //clothingType = "Pants";
    public void processPantsOrder(Scanner scanner, Customer customer, Receipt receipt) {
        ProductionObserver productionObserver = new ProductionObserver();
        CEO ceo = new CEO();
        PantsBuilder pantsBuilder = new PantsBuilder();

        System.out.println("What material would you like your pants to be made out of?");
        System.out.println("1. Cotton");
        System.out.println("2. Wool");
        System.out.println("3. Silk");

        int pantsMaterialChoice = scanner.nextInt();
        String pantsMaterial;

        switch (pantsMaterialChoice) {
            case 1:
                pantsMaterial = "Cotton";
                break;
            case 2:
                pantsMaterial = "Wool";
                break;
            case 3:
                pantsMaterial = "Silk";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("What size would you like to order?");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        int pantsSizeChoice = scanner.nextInt();
        String pantsSize;

        switch (pantsSizeChoice) {
            case 1:
                pantsSize = "Small";
                break;
            case 2:
                pantsSize = "Medium";
                break;
            case 3:
                pantsSize = "Large";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("What color would you like your pants to be?");
        System.out.println("1. White");
        System.out.println("2. Blue");
        System.out.println("3. Green");

        int colorChoice = scanner.nextInt();
        String pantsColor;

        switch (colorChoice) {
            case 1:
                pantsColor = "White";
                break;
            case 2:
                pantsColor = "Blue";
                break;
            case 3:
                pantsColor = "Green";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        Pants pants = new Pants();
        pants.addPropertyChangeListener(productionObserver);


        pants = pantsBuilder
                .addMaterial(pantsMaterial)
                .addSize(pantsSize)
                .addColor(pantsColor)
                .build();

        //pants.addPropertyChangeListener(productionObserver);

        PantsProcessingPipeline pantsProcessingPipeline = new PantsProcessingPipeline();

        System.out.println("What fit would you like your pants to be?");
        System.out.println("1. Regular Fit");
        System.out.println("2. Slim Fit");
        int pantsFitChoice = scanner.nextInt();

        switch (pantsFitChoice) {
            case 1:
                pantsProcessingPipeline.addCommand(new PantsRegularFitCommand());
                break;
            case 2:
                pantsProcessingPipeline.addCommand(new PantsSlimFitCommand());
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("What lenght would you like your pants to be?");
        System.out.println("1. Classic lenght");
        System.out.println("2. Surfer lenght");
        int pantsLenghtChoice = scanner.nextInt();

        switch (pantsLenghtChoice) {
            case 1:
                pantsProcessingPipeline.addCommand(new PantsClassicLenghtCommand());
                break;
            case 2:
                pantsProcessingPipeline.addCommand(new PantsSurferLenghtCommand());
                break;
            default:
                System.out.println("Invalid choice");

        }

        pants = pantsProcessingPipeline.execute(pants);

        receipt.printPantsReceipt(customer, pants);
    }


    public void processTShirtOrder(Scanner scanner, Customer customer, Receipt receipt) {

        TShirtBuilder tShirtBuilder = new TShirtBuilder();
        ProductionObserver productionObserver = new ProductionObserver();

        System.out.println("What material would you like your T-Shirt to be made out of?");
        System.out.println("1. Cotton");
        System.out.println("2. Wool");
        System.out.println("3. Silk");

        int tshirtMaterialChoice = scanner.nextInt();
        String tshirtMaterial;

        switch (tshirtMaterialChoice) {
            case 1:
                tshirtMaterial = "Cotton";
                break;
            case 2:
                tshirtMaterial = "Wool";
                break;
            case 3:
                tshirtMaterial = "Silk";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("What size would you like to order?");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        int tshirtSizeChoice = scanner.nextInt();
        String tshirtSize;

        switch (tshirtSizeChoice) {
            case 1:
                tshirtSize = "Small";
                break;
            case 2:
                tshirtSize = "Medium";
                break;
            case 3:
                tshirtSize = "Large";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("What color would you like your T-Shirt to be?");
        System.out.println("1. White");
        System.out.println("2. Blue");
        System.out.println("3. Green");

        int tshirtColorChoice = scanner.nextInt();
        String tshirtColor;

        switch (tshirtColorChoice) {
            case 1:
                tshirtColor = "White";
                break;
            case 2:
                tshirtColor = "Blue";
                break;
            case 3:
                tshirtColor = "Green";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        TShirt tshirt = tShirtBuilder
                .addMaterial(tshirtMaterial)
                .addSize(tshirtSize)
                .addColor(tshirtColor)
                .build();

        tshirt.addPropertyChangeListener(productionObserver);

        TShirtProcessingPipeline tShirtProcessingPipeline = new TShirtProcessingPipeline();

        System.out.println("What fit would you like your neck to be?");
        System.out.println("1. Crew neck");
        System.out.println("2. V-Neck");
        int tShirtNeckChoice = scanner.nextInt();

        switch (tShirtNeckChoice) {
            case 1:
                tShirtProcessingPipeline.addCommand(new TShirtCrewNeckCommand());
                break;
            case 2:
                tShirtProcessingPipeline.addCommand(new TShirtVNeckCommand());
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("What arm-lenght would you like your T-Shirt sleeves to be?");
        System.out.println("1. Short sleeves");
        System.out.println("2. Long sleeves");
        int tShirtSleeveChoice = scanner.nextInt();

        switch (tShirtSleeveChoice) {
            case 1:
                tShirtProcessingPipeline.addCommand(new TShirtShortSleevesCommand());
                break;
            case 2:
                tShirtProcessingPipeline.addCommand(new TShirtLongSleevesCommand());
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        tshirt = tShirtProcessingPipeline.execute(tshirt);
        System.out.println(tshirt.getSleeves() + tshirt.getColor());

        receipt.printTshirtReceipt(customer, tshirt);

    }

    public void processSkirtOrder(Scanner scanner, Customer customer, Receipt receipt) {

        SkirtBuilder skirtBuilder = new SkirtBuilder();

        System.out.println("What material would you like your skirt to be made out of?");
        System.out.println("1. Cotton");
        System.out.println("2. Wool");
        System.out.println("3. Silk");

        int skirtMaterialChoice = scanner.nextInt();
        String skirtMaterial;

        switch (skirtMaterialChoice) {
            case 1:
                skirtMaterial = "Cotton";
                break;
            case 2:
                skirtMaterial = "Wool";
                break;
            case 3:
                skirtMaterial = "Silk";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("What size would you like to order?");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        int skirtSizeChoice = scanner.nextInt();
        String skirtSize;

        switch (skirtSizeChoice) {
            case 1:
                skirtSize = "Small";
                break;
            case 2:
                skirtSize = "Medium";
                break;
            case 3:
                skirtSize = "Large";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("What color would you like your pants to be?");
        System.out.println("1. White");
        System.out.println("2. Blue");
        System.out.println("3. Green");

        int skirtColorChoice = scanner.nextInt();
        String skirtColor;

        switch (skirtColorChoice) {
            case 1:
                skirtColor = "White";
                break;
            case 2:
                skirtColor = "Blue";
                break;
            case 3:
                skirtColor = "Green";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        Skirt skirt = skirtBuilder
                .addMaterial(skirtMaterial)
                .addSize(skirtSize)
                .addColor(skirtColor)
                .build();

        SkirtProcessingPipeline skirtProcessingPipeline = new SkirtProcessingPipeline();

        System.out.println("What fit would you like your waist to be?");
        System.out.println("1. Wide");
        System.out.println("2. Small");
        int skirtWaistFit = scanner.nextInt();

        switch (skirtWaistFit) {
            case 1:
                skirtProcessingPipeline.addCommand(new SkirtWideFitCommand());
                break;
            case 2:
                skirtProcessingPipeline.addCommand(new SkirtSlimFitCommand());
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("What pattern would you like your skirt to be?");
        System.out.println("1. No pattern");
        System.out.println("2. Dotted pattern");
        int skirtPattern = scanner.nextInt();

        switch (skirtPattern) {
            case 1:
                skirtProcessingPipeline.addCommand(new SkirtNoPatternCommand());
                break;
            case 2:
                skirtProcessingPipeline.addCommand(new SkirtDottedPatternCommand());
                break;
            default:
                System.out.println("Invalid choice");
        }


        skirt = skirtProcessingPipeline.execute(skirt);

        receipt.printSkirtReceipt(customer, skirt);

    }


}
