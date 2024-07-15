/* To calculate the sum of square of digits of number using recursive function */

import java.util.Scanner;

public class SumOfSquareDigitsRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sumOfSquareDigits = calculateSumOfSquareDigits(number);
        System.out.println("Sum of squares of digits of " + number + " is: " + sumOfSquareDigits);
    }

    // Recursive method to calculate the sum of squares of digits
    public static int calculateSumOfSquareDigits(int num) {
        // Base case: If the number is less than 10, its square will be the sum
        if (num < 10) {
            return num * num;
        }
        // Recursive case: Calculate the square of the last digit and add it to the sum
        int lastDigit = num % 10;
        return lastDigit * lastDigit + calculateSumOfSquareDigits(num / 10);
    }
}