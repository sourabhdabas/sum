import java.util.Scanner;

public class SumOfSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take three numbers as input
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the smallest and largest numbers
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Calculate the sum
        int sum = smallest + largest;

        // Print the result
        System.out.println("The sum of the smallest and largest number is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

