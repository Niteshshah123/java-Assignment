// /*Write a program in java add, subtract, multiply, and divide the binary number depending upon user requirement. */

import java.util.Scanner;

public class qst11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result of addition: " + addBinary(binary1, binary2));
                break;
            case 2:
                System.out.println("Result of subtraction: " + subtractBinary(binary1, binary2));
                break;
            case 3:
                System.out.println("Result of multiplication: " + multiplyBinary(binary1, binary2));
                break;
            case 4:
                System.out.println("Result of division: " + divideBinary(binary1, binary2));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static String addBinary(String binary1, String binary2) {
        long num1 = Long.parseLong(binary1, 2);
        long num2 = Long.parseLong(binary2, 2);
        long sum = num1 + num2;
        return Long.toBinaryString(sum);
    }

    private static String subtractBinary(String binary1, String binary2) {
        long num1 = Long.parseLong(binary1, 2);
        long num2 = Long.parseLong(binary2, 2);
        long difference = num1 - num2;
        return Long.toBinaryString(difference);
    }

    private static String multiplyBinary(String binary1, String binary2) {
        long num1 = Long.parseLong(binary1, 2);
        long num2 = Long.parseLong(binary2, 2);
        long product = num1 * num2;
        return Long.toBinaryString(product);
    }

    private static String divideBinary(String binary1, String binary2) {
        long num1 = Long.parseLong(binary1, 2);
        long num2 = Long.parseLong(binary2, 2);

        if (num2 == 0) {
            return "Error: Division by zero";
        }

        long quotient = num1 / num2;
        return Long.toBinaryString(quotient);
    }
}
