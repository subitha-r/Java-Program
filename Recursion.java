/*
 * Using Recursion reverse the string such as
 * Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I 
 */

import java.io.*;

public class Recursion {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence:");
        String input = br.readLine();

        String reversed = reverseWords(input);
        System.out.println("Reversed: " + reversed);
    }

    // Function to reverse the words in the string using recursion
    public static String reverseWords(String str) {
        // Base case: If the string is empty or has no spaces, return the string
        if (str.isEmpty() || !str.contains(" ")) {
            return str;
        }

        // Find the last space in the string
        int lastSpaceIndex = str.lastIndexOf(' ');

        // Extract the last word and the remaining part of the string
        String lastWord = str.substring(lastSpaceIndex + 1);
        String remainingString = str.substring(0, lastSpaceIndex);

        // Recursively reverse the remaining part of the string and append the last word
        return lastWord + " " + reverseWords(remainingString);

    } // Method

} // class

// Reverse the character and word
/*
 * I love India
 * Reversed: aidnI evol I
 * 
 * public static String reverse(String str) {
 * if ((null == str) || (str.length() <= 1)) {
 * return str;
 * }
 * return reverse(str.substring(1)) + str.charAt(0);
 * }
 * 
 */