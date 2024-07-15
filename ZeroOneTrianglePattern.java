//Zero-One Triangle Pattern
/*
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 
 */
public class ZeroOneTrianglePattern {
    public static void main(String args[]) {
        int i, j, sum, n = 6;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}

// Another different pattern
/*
 * 1 0 1 0 1 0
 * 1 0 1 0 1
 * 1 0 1 0
 * 1 0 1
 * 1 0
 * 1
 * 
 * CODE
 * public class ZeroOneTrianglePattern {
 * public static void main(String args[]) {
 * int i, j, sum, n = 6;
 * for (i = 1; i <= n; i++) {
 * for (j = i; j <= 6; j++) {
 * if ((i + j) % 2 == 0)
 * System.out.print(1 + " ");
 * else
 * System.out.print(0 + " ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */