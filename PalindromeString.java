import java.io.*;
import java.util.*;

public class PalindromeString {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str1, str2 = "";
        char ch;

        System.out.println("Enter the word:");
        str1 = sc.next();
        str1 = str1.toLowerCase();

        System.out.println("Enter the choice: \n1. Using Built-in Function \n2. User defined function");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                str2 = new StringBuilder(str1).reverse().toString();
                System.out.println("The Original String:" + str1);
                System.out.println("The Reversed String: " + str2);
                if (str1.equals(str2))
                    System.out.println(str1 + " and " + str2 + " are palindrome");
                else
                    System.out.println(str1 + " and " + str2 + " are non-palindrome");
                break;
            }
            case 2: {
                char ch1[] = str1.toCharArray();
                for (int i = str1.length() - 1; i >= 0; i--) {
                    str2 += ch1[i];
                }
                System.out.println("The Original String:" + str1);
                System.out.println("The Reversed String: " + str2);
                if (str1.equals(str2))
                    System.out.println(str1 + " and " + str2 + " are palindrome");
                else
                    System.out.println(str1 + " and " + str2 + " are non-palindrome");
                break;
            }
        }

    }
}
