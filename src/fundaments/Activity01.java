package fundaments;

/* A program to read two integer numbers and show
on screen the sum of them.
 */
import java.util.Scanner;

public class Activity01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, sum;

        System.out.print("Enter number one: ");
        number1 = sc.nextInt();
        System.out.print("Enter number two: ");
        number2 = sc.nextInt();

        sum = number1 + number2;

        System.out.printf("The sum of these two numbers is = %d", sum);

        sc.close();

    }
}
