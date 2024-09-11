/*Reverse a String
Write a Java program to reverse a given string without using any built-in functions 
or libraries. 
 */

import java.io.*;
import java.util.*;

public class StringReverse {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word, reversedword = "";
        char ch[];

        System.out.println("Enter the string:");
        word = sc.next();
        word = word.toLowerCase();

        System.out.println("Enter the choice: \n1. Using Built-in Function \n2. User defined function");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                reversedword = new StringBuilder(word).reverse().toString();
                System.out.print("The reversed String is:" + reversedword);
                break;
            }
            case 2: {
                ch = word.toCharArray();
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedword += ch[i];
                }
                System.out.print("The reversed String is:" + reversedword);
                break;
            }

        }

    }
}
