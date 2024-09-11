/* A string is given. Our task is to write a Java program to toggle the characters of the
 given string. For example, for the string "jaVaTpoiNt", the string after the toggle 
 will be "JAvAtPOInT".
It is a well-known fact that strings are immutable in Java. 
Therefore, it is required to create a new string. 
For toggling, we can use ASCII value, 'a' can be converted to 'A' by 'A' = 'a' - 32. */

import java.io.*;
import java.util.*;

public class Toggle {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word;
        char ch;
        int i;
        StringBuffer word2 = new StringBuffer();

        System.out.println("Enter the String:");
        word = sc.next();

        for (i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                word2.append((char) (ch + 32)); // Append belongs to String Buffer
            else if (ch >= 'a' && ch <= 'z')
                word2.append((char) (ch - 32));
            else
                word2.append(ch);
        }

        System.out.println("After toggling, the string " + word + " becomes: " + word2);
    }
}
