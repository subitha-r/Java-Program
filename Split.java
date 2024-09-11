
/*Eg 1: Input: a1b1
       Output: ab
Eg: 2: Input: b3c6
          Output: bbbcccccc */

import java.io.*;

public class Split {
    public static void main(String args[]) throws IOException {
        String input;
        char c;
        int num, j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word");
        input = br.readLine();

        num = input.length();
        for (int i = 0; i < num; i++) {
            c = input.charAt(i);
            if (Character.isLetter(c))
                System.out.print(c);
            else if (Character.isDigit(c)) {
                int a = Character.getNumericValue(c);
                for (j = 0; j < a - 1; j++) {
                    System.out.print(input.charAt(i - 1));
                }

            } else
                System.out.println("The element " + c + " is a Special Character");
        }
    }
}