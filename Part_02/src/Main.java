import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter customer information
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer type (Premium/Gold/Silver): ");
        String customerType = scanner.nextLine();

        // Create Customer object
        Customer customer = new Customer(customerName, customerType);

        // Prompt the user to enter sale information
        System.out.print("Enter sale date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        // Present options for product expense
        System.out.println("Select product expense option:");
        System.out.println("1. $100");
        System.out.println("2. $200");
        System.out.println("3. Custom amount");
        System.out.print("Enter your choice: ");
        int productChoice = scanner.nextInt();

        double productExpense;
        switch (productChoice) {
            case 1:
                productExpense = 100;
                break;
            case 2:
                productExpense = 200;
                break;
            case 3:
                System.out.print("Enter custom product expense(Refer to '%'): ");
                productExpense = scanner.nextDouble();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to $0 product expense.");
                productExpense = 0;
                break;
        }

        // Prompt the user to enter service expense
        System.out.print("Enter service expense: ");
        double serviceExpense = scanner.nextDouble();

        // Create Sale object
        Sale sale = new Sale(customer, date);
        sale.setServiceExpense(serviceExpense);
        sale.setProductExpense(productExpense);

        // Display sale information
        sale.displayInfo();

        // Close scanner
        scanner.close();
    }
}
