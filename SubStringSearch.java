/*
 * Find the index of first occurance of String
 *
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */

import java.io.*;

public class SubStringSearch {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, substr;

        System.out.println("Enter the Main String:");
        str = br.readLine();
        System.out.println("Enter the substring to be searched:");
        substr = br.readLine();

        System.out.println(
                "Enter your choice: \n1. Contains Method \n2. IndexOf Method \n3. Altering INDEXOF ");
        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1: {
                // Returns only true or false
                if (str.contains(substr))
                    System.out.println(substr + " is present in the given string " + str);
                break;
            }
            case 2: {
                // Returns only the starting index of the given substring
                int index = str.indexOf(substr); // Returns -1 if not present
                System.out.println(substr + " is present at the index " + index + " of the given string " + str);
                break;
            }
            case 3: {
                // Altering INDEXOF Function to find the end position of the given substring
                int startindex = str.indexOf(substr);
                int endindex = startindex + substr.length();
                System.out
                        .println(substr + " is present from the index " + startindex + "to " + endindex + " of " + str);
                break;
            }
        } // Switch close
    }
}