package fundaments;

import java.util.Scanner;

public class Activity03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, difference;

        System.out.print("Enter four integer numbers: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        difference = A * B - C * D;

        System.out.println("The difference is " + difference);

        sc.close();
    }
}
