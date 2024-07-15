/*
 * Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
 * Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
 */

import java.io.*;

public class SearchSubstring {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string1, string2;
        int position;

        // Input for string1 and string 2
        System.out.println("Enter the word:");
        string1 = br.readLine();
        System.out.println("Enter the string to be searched");
        string2 = br.readLine();

        position = string1.indexOf(string2);
        System.out.println("The substring " + string2 + "is present in the position " + position);
    }
}
