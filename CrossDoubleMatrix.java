
/*
 * Write a program to print the following output for the given input. You can assume the string is of odd length
Eg 1: Input: 12345
       Output:
1       5
  2   4
    3
  2  4
1      5
Eg 2: Input: geeksforgeeks
         Output:
g                         s
  e                     k
    e                 e
      k             e
        s         g
          f      r
             o
          f     r
        s         g
      k             e
    e                 e
  e                      k
g                          s 

 */
import java.io.*;

public class CrossDoubleMatrix {
  public static void main(String argsp[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size, i, j;
    char ch[];
    String input;

    System.out.print("\nEnter the element to display:");
    input = br.readLine();
    size = input.length();
    ch = new char[size];

    for (i = 0; i < size; i++) {
      ch[i] = input.charAt(i);
    }

    for (i = 0; i < size; i++) {
      for (j = 0; j < size; j++) {
        if (i == j)
          System.out.print(ch[i] + " ");
        else if (i + j == size - 1)
          System.out.print(ch[j] + "");
        else
          System.out.print(" ");
      }
      System.out.println("");
    }
  }
}

// Inverted cross Display
/*
 * (Explanation: else if (i + j == size - 1)
 * System.out.print(ch[j] + "");
 * )
 * 
 * Iteration i=0
 * 
 * j=0
 * 0+1=5-1 (NE)
 * j=1
 * 0+0=5-1 (NE)
 * j=2
 * 0+2=5-1 (NE)
 * j=3
 * 0+3=5-1 (NE)
 * j=4
 * 0+4=5-1 (Equal) ch[j]=? ch[4]=5
 */

// Another method
/*
 * import java.io.*;
 * 
 * public class CrossDisplayMatrix {
 * public static void main(String args[]) throws IOException {
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * int size, i, j;
 * String input;
 * 
 * System.out.print("Enter the element to display: ");
 * input = br.readLine();
 * size = input.length();
 * 
 * for (i = 0; i < size; i++) {
 * for (j = 0; j < size; j++) {
 * if (i == j) {
 * // Main diagonal
 * System.out.print(input.charAt(i));
 * } else if (i + j == size - 1) {
 * // Secondary diagonal
 * System.out.print(input.charAt(j));
 * } else {
 * System.out.print(" ");
 * }
 * }
 * System.out.println();
 * }
 * }
 * }
 * 
 */