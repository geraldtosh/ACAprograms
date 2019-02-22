package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println();
        System.out.println(" Crazy Ed's Wholesale String Cheese ");
        System.out.println(" ----------------------------------");
        System.out.println("            Price Quote   \n");

        System.out.println("   What size cheese? 1,2 or 3 inch diameter? ");

        double totalPrice = 0.00;
        double shippingPrice = 0.00;
        boolean shippingFree = false;
        double basicCheeseCost = 0.00;
        double handlingCharge = 5.00;

        int sizeCheeseInch = userInput.nextInt();
        if ((sizeCheeseInch < 1) && (sizeCheeseInch > 3))
        {
            System.out.println("The order is too crazy");
        }
        System.out.println("   How many yards of cheese? \n" + "");
        int sizeCheeseYard = userInput.nextInt();

        if (sizeCheeseYard < 1 || sizeCheeseYard > 1000)
        {
            System.out.println("The order is too crazy");
        }
        // 1" cheese
        if (sizeCheeseInch == 1 && sizeCheeseYard > 50)
        {
            basicCheeseCost = (sizeCheeseYard * 2);
            System.out.println("Cheese cost:     $" + basicCheeseCost);
            System.out.println("Shipping price:  $0.00");
            System.out.println("Handling charge: $" + handlingCharge);
            totalPrice = basicCheeseCost + shippingPrice + handlingCharge;
            System.out.println("Total price:     $" +totalPrice);
        }
            else
            {
                basicCheeseCost = (sizeCheeseYard * 2);
                System.out.println("Cheese cost:     $" + basicCheeseCost);
                shippingPrice = sizeCheeseYard * 2;
                System.out.println("Shipping Cost:   $" + shippingPrice);
                handlingCharge = 5;
                System.out.println("Handling Charge: $" + handlingCharge);
                totalPrice = basicCheeseCost + shippingPrice + handlingCharge;
                System.out.println("Total price   :  $" +totalPrice);
            }
        // 2" cheese
        if (sizeCheeseInch == 2 && sizeCheeseYard > 75)
        {
            basicCheeseCost = (sizeCheeseYard * 4);
            System.out.println("Cheese cost:     $" + basicCheeseCost);
            System.out.println("Shipping price:  $0.00");
            System.out.println("Handling charge: $" + handlingCharge);
            totalPrice = basicCheeseCost + shippingPrice + handlingCharge;
            System.out.println("Total price:     $" +totalPrice);
        }
            else if (sizeCheeseInch == 2 && sizeCheeseYard < 75)
            {
                basicCheeseCost = (sizeCheeseYard * 2);
                System.out.println("Cheese cost:     $" + basicCheeseCost);
                shippingPrice = sizeCheeseYard * 2;
                System.out.println("Shipping Cost:   $" + shippingPrice);
                handlingCharge = 5;
                System.out.println("Handling Charge: $" + handlingCharge);
                totalPrice = basicCheeseCost + shippingPrice + handlingCharge;
                System.out.println("Total price   :  $" +totalPrice);
            }
        // 3" cheese
        if (sizeCheeseInch == 3 && sizeCheeseYard > 25)
        {
            basicCheeseCost = (sizeCheeseYard * 6);
            System.out.println("Cheese cost:     $" + basicCheeseCost);
            System.out.println("Shipping price:  $0.00");
            System.out.println("Handling charge: $" + handlingCharge);
            totalPrice = basicCheeseCost + shippingPrice + handlingCharge;
            System.out.println("Total price:     $" +totalPrice);
        }
        else
        {
            basicCheeseCost = (sizeCheeseYard * 6);
            System.out.println("Cheese cost:     $" + basicCheeseCost);
            shippingPrice = sizeCheeseYard * 4;
            System.out.println("Shipping Cost:   $" + shippingPrice);
            handlingCharge = 5;
            System.out.println("Handling Charge: $" + handlingCharge);
            totalPrice = basicCheeseCost + shippingPrice + handlingCharge;
            System.out.println("Total price   :  $" +totalPrice);
        }
    }
}




