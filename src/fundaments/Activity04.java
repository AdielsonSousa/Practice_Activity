package fundaments;

/* A program to read an employee's name, their code number and worked hours,
then calculating their salary with two decimal places.
 */

import java.util.Locale;
import java.util.Scanner;

public class Activity04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int employeeCode, workedHours;
        double valueOfHour, salary;

        System.out.print("Employee Name: ");
        name = sc.nextLine();
        System.out.print("Employee Code: ");
        employeeCode = sc.nextInt();
        System.out.print("Worked Hours: ");
        workedHours = sc.nextInt();
        System.out.print("Value of Hour: ");
        valueOfHour = sc.nextDouble();

        salary = workedHours * valueOfHour;

        System.out.printf("Employee %s code %d earns U$ %.2f", name, employeeCode, salary);

        sc.close();
    }
}