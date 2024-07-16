//Rhombus Patter
/*
      ******
    ******
   ******
  ******
 ******
******
 */
public class RhombusPattern {
    public static void main(String args[]) {
        int n = 6, i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
