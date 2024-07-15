
/*
 * Write a program to print the following output for the given input. You can assume the string is of odd length
 * Eg 1: Input: 12345
       Output:
1    1 
 2  2  
  3    
 4  4  
5    5 

Eg 2: Input: geeksforgeeks
         Output:
g            g 
 e          e  
  e        e   
   k      k    
    s    s     
     f  f      
      o        
     r  r
    g    g
   e      e
  e        e
 k          k
s            s

*/
import java.io.*;

public class CrossDisplayMatrix {
    public static void main(String args[]) throws IOException {
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
                if (i == j || i + j == size - 1)
                    System.out.print(ch[i] + " ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
