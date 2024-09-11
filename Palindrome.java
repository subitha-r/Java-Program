import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num, r, i, temp, sum = 0;
        System.out.print("\nEnter the number:");
        num = sc.nextInt();
        temp = num;

        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }

        if (temp == sum)
            System.out.println(temp + " is a palindrome number");
        else
            System.out.println(temp + " is not a palindrome number");
    }
}