/*Calculate the length of the string without using built in functions like len() */

import java.util.*;
import java.io.IOException;

public class Length {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word;
        int i = 0, len = 0;
        char ch[];

        System.out.println("Enter the string:");
        word = sc.next();
        ch = word.toCharArray();

        // Loop through the character array until the end of the array is reached
        while (i < ch.length) {
            len++; // Increment length for each character
            i++; // Move to the next character
        }

        System.out.println("The length of the string \"" + word + "\" is: " + len);
    }
}

/*
 * while (true) {
 * if (ch[i] != '\0') {
 * len++;
 * i++;
 * } else
 * break;
 * i++;
 * }
 * 
 * Java Strings Are Not Null-Terminated: In Java, unlike in C or C++, strings
 * are not null-terminated, meaning they do not have a special '\0' character at
 * the end. Instead, Java tracks the length of strings internally. Therefore,
 * the condition if (ch[i] != '\0') will never encounter a '\0' because it
 * doesn't exist in Java strings. Eventually, the loop tries to access an index
 * outside the bounds of the char[] array, causing the
 * ArrayIndexOutOfBoundsException.
 * 
 * 
 */