import java.util.Scanner;

public class ExpenseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpense = quantity * pricePerItem;

        System.out.println("Total expenses: $" + totalExpense);

        scanner.close();
    }
}
