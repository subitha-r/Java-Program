
/*Number-increasing Pyramid Pattern 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
*/
public class NumberincreasingPyramidPattern {
    public static void main(String args[]) {
        int i, j;
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= 6; j++) {
                if (i > j) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

// Another method
/*
 * public static void printPattern(int n)
 * {
 * int i, j;
 * // outer loop to handle number of rows
 * for (i = 1; i <= n; i++) {
 * // inner loop to handle number of columns
 * for (j = 1; j <= i; j++) {
 * // printing column values upto the row
 * // value.
 * System.out.print(j + " ");
 * }
 * 
 * // print new line for each row
 * System.out.println();
 * }
 * }
 */