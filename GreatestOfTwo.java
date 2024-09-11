/* find greatest of two numbers without using comparison operators */

import java.io.*;
import java.util.*;
import java.lang.Math;

public class GreatestOfTwo {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("Enter 2 numbers:");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.print("\nThe greatest of " + x + " and " + y + " is " + (Math.abs(x - y) + (x + y)) / 2);
    }
}
