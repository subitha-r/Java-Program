
/* Square hallow pattern
******
*    *
*    *
*    *
*    *
******
*/
public class SquareHallowPattern {
    public static void main(String args[]) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == 6 - 1
                        || j == 6 - 1) {
                    System.out.print("*");
                }
                // otherwise print space only.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
