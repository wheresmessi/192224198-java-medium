import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their income
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        // Initialize the tax variable
        double tax = 0;

        // Calculate tax based on the given conditions
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.10;
        } else if (income <= 1000000) {
            tax = (250000 * 0.10) + (income - 500000) * 0.20;
        } else {
            tax = (250000 * 0.10) + (500000 * 0.20) + (income - 1000000) * 0.30;
        }

        // Calculate taxable income
        double taxableIncome = income > 250000 ? income - 250000 : 0;

        // Print the taxable income and the tax
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax= " + tax);
    }
}
