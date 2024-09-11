//Count Words in a Sentence

import java.io.*;

public class CountWords {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence;
        int count = 1, i;
        char ch;

        System.out.println("Enter the sentence:");
        sentence = br.readLine();

        System.out.print("\n1. Method 1 Char Array \n2. Method 2 Using Split & Trim \n");
        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1: {
                for (i = 0; i < sentence.length(); i++) {
                    ch = sentence.charAt(i);
                    if (ch == ' ')
                        count++;
                }
                System.out.println("The count is: " + count);
                break;
            }
            case 2: {
                if (sentence == null || sentence.isEmpty())
                    System.out.println("String is Empty");
                else {
                    // Split the sentence into words using whitespace as delimiter
                    String[] words = sentence.trim().split("\\s+"); // \s means space
                    System.out.println("The count is: " + words.length);
                }
                break;
            }
        }
    }

}
