package fundaments;

import java.util.Locale;
import java.util.Scanner;

public class Activity02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double ray, area;
        final double PI = 3.14159;

        System.out.print("Enter value of ray: ");
        ray = sc.nextDouble();

        area = PI * ray * ray;

        System.out.printf("The area is %.4f", area);


        sc.close();
    }

}
