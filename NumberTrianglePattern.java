/*Number triangle pattern
 *   1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 
 */
public class NumberTrianglePattern {
    public static void main(String args[]) {
        int i, j;
        for (i = 1; i <= 6; i++) {
            // inner loop to print space
            for (j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print number
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // print new line for each row
            System.out.println();
        }
    }
}
