import java.util.Scanner;

public class Inputlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        
        if (n < 0) {
            System.out.println("Invalid number of elements.");
            return;
        }

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The input numbers are:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}