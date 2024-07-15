//Piglatin (Only or name)

import java.io.*;

class Piglatin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word;

		System.out.println("Enter a string");
		word = br.readLine();

		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isLetter(ch))
				System.out.println(ch + " is a character");
			else
				System.out.println(ch + " is a number");
		} // for

	}
}

/*
 * Another method
 * 
 * import java.io.*;
 * 
 * public class Split {
 * public static void main(String args[]) throws IOException {
 * String input;
 * char c;
 * int num;
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * System.out.println("Enter a word");
 * input = br.readLine();
 * 
 * num = input.length();
 * for (int i = 0; i < num; i++) {
 * c = input.charAt(i);
 * if (Character.isLetter(c)) // if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' &&
 * ch <= 'z'))
 * System.out.println("The element " + c + " is a Letter");
 * else if (Character.isDigit(c)) // if (ch >= '0' && ch <= '9')
 * System.out.println("The element " + c + " is Digit");
 * else
 * System.out.println("The element " + c + " is a Special Character");
 * }
 * }
 * }
 * 
 */