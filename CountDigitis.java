/* Write a Java program for counting the digits present in a number. */

import java.io.*;

public class CountDigitis {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, i, count = 0, arr[], r;

        System.out.println("Enter the digit:");
        num = Integer.parseInt(br.readLine());

        System.out.println("1. Count the Number of Digits \n2. No. of occurance of given digit");
        System.out.println("3. Number of occurance of each digit");
        System.out.println("\nEnter ur Choice:");
        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1: {
                while (num != 0) {
                    num = num / 10;
                    count++;
                }
                System.out.println("The count of digits is " + count);
                break;
            }
            case 2: {
                System.out.println("Enter the number to check no. of occurances");
                int n = Integer.parseInt(br.readLine());
                while (num != 0) {
                    r = num % 10;
                    if (r == n)
                        count++;
                    num = num / 10;
                }
                System.out.println("The number of occurance of " + n + " is " + count);
                break;
            }
            case 3: {
                // Find the value of int by converting it to string
                int length = String.valueOf(num).length();
                num = Integer.valueOf(num);
                arr = new int[length];
                while (num != 0) {
                    r = num % 10;
                    arr[r]++;
                    num = num / 10;
                }

                // 9 as limit (0-9 Digits)
                for (i = 0; i < 9; i++) {
                    System.out.println("The number of occurance of " + i + " is " + arr[i]);
                }
                break;
            }
        }
    }
}
