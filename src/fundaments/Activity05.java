package fundaments;

/* A program to read the name of a product, its code and quantity,
and then showing on screen the amount to pay.
 */

import java.util.Locale;
import java.util.Scanner;

public class Activity05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String productName1, productName2;
        int quantityProduct1, quantityProduct2, productCode1, productCode2;
        double priceProduct1, priceProduct2, amountToPay;

        System.out.print("Name of Product 1: ");
        productName1 = sc.nextLine();
        System.out.print("Code of Product 1: ");
        productCode1 = sc.nextInt();
        System.out.print("Quantity of Product 1: ");
        quantityProduct1 = sc.nextInt();
        System.out.print("Value of Product 1: ");
        priceProduct1 = sc.nextDouble();
        System.out.println("*****************************************");

        sc.nextLine();
        System.out.print("Name of Product 2: ");
        productName2 = sc.nextLine();
        System.out.print("Code of Product 2: ");
        productCode2 = sc.nextInt();
        System.out.print("Quantity of Product 2: ");
        quantityProduct2 = sc.nextInt();
        System.out.print("Value of Product 2: ");
        priceProduct2 = sc.nextDouble();
        System.out.println("*****************************************");

        amountToPay = (priceProduct1 * quantityProduct1) + (priceProduct2 * quantityProduct2);

        System.out.printf("Product 1: %s, code %d and quantity %d%n",
                productName1, productCode1, quantityProduct1 );

        System.out.printf("Product 2: %s, code %d and quantity %d%n ",
                productName2, productCode2, quantityProduct2);

        System.out.printf("Amount to pay is U$ %.2f dollars", amountToPay);

        sc.close();

    }
}