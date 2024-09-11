/*Multiplication of 2 numbers without using '*' */

import java.io.*;

public class Multiplication {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, first, second, sum = 0;

        System.out.print("Enter the first and second number:");
        first = Integer.parseInt(br.readLine());
        second = Integer.parseInt(br.readLine());

        for (i = 0; i < second; i++) {
            sum += first;
        }

        System.out.print("\n" + first + "*" + second + "=" + sum);

    }

}
