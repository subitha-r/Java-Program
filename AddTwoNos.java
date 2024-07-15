import java.util.*;

public class AddTwoNos {
    public static String toString(int[] a) {
        String res = "";
        for (int i : a) {
            res += Integer.toString(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int sum = Integer.parseInt(toString(a)) + Integer.parseInt(toString(b));

        System.out.println(sum);
    }

}

/*
 * Reading input lengths:
 * 
 * n and m are read. For example, if n = 3 and m = 3.
 * Reading array elements:
 * 
 * For array a, suppose the input is 1 2 3.
 * For array b, suppose the input is 4 5 6.
 * Concatenating arrays to form numbers:
 * 
 * The method toString(int[] a) concatenates the elements of the array into a
 * single string.
 * For a, the result is "123".
 * For b, the result is "456".
 * Converting the concatenated strings to integers:
 * 
 * Convert "123" to the integer 123.
 * Convert "456" to the integer 456.
 * Adding the two numbers:
 * 
 * 123 + 456 = 579.
 * Printing the result:
 * 
 * The program prints 579.
 */