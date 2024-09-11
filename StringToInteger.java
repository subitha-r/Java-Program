/* Convert String to Integer without using built-in functions like int() */

import java.util.*;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int result = 0;

        System.out.print("Enter a positive number as a string: ");
        str = sc.next();

        // Convert each character to its corresponding digit and accumulate the result
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Ensure that the character is a digit
            if (ch >= '0' && ch <= '9') {
                result = result * 10 + (ch - '0'); // Convert character to numeric value
            } else {
                System.out.println("Invalid input: Only numeric characters are allowed.");
                return; // Exit the program if a non-numeric character is found
            }
        }
        System.out.println("The integer value is: " + result);
    }
}
