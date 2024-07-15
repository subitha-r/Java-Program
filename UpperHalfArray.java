public class UpperHalfArray {
    public static void main(String[] args) {
        // Example 5x5 array
        int[][] array = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        // Point to the upper half of the array
        int[][] upperHalf = getUpperHalf(array);

        // Print the upper half of the array
        for (int i = 0; i < upperHalf.length; i++) {
            for (int j = 0; j < upperHalf[i].length; j++) {
                System.out.print(upperHalf[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getUpperHalf(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        System.out.println(rows+" "+cols);
        int[][] upperHalf = new int[rows][cols];
        int i,j;

        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                if (i <= j) { // Condition to point to the upper half of the array
                    upperHalf[i][j] = array[i][j];
                } else {
                    upperHalf[i][j] = 0; // Set elements below the diagonal to 0
                }
            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
        System.out.print(upperHalf[i][j] + " ");
            }
            System.out.println();
        }
        return upperHalf;
    }
}
