//Diamond Star pattern
/*
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *

 */
public class DiamondStarPattern {
    public static void main(String args[]) {
        int i, j, n = 6;
        // Upper half
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) // (j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (i = n - 1; i >= 1; i--) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
