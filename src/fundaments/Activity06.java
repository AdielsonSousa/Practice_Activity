package fundaments;

import java.util.Locale;
import java.util.Scanner;

public class Activity06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, trapeze, square, triangle, circle, rectangle;
        final double PI = 3.14159;

        System.out.print("Enter three numbers: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        trapeze = (A + B) / 2 * C;
        rectangle = A * B;
        triangle = (A * C) / 2;
        square = B * B;
        circle = PI * C * C;

        System.out.printf("Area Trapeze = %.3f%n", trapeze);
        System.out.printf("Area Rectangle = %.3f%n", rectangle);
        System.out.printf("Area Triangle = %.3f%n", triangle);
        System.out.printf("Area Square = %.3f%n", square);
        System.out.printf("Area Circle = %.3f%n", circle);

        sc.close();

    }
}
