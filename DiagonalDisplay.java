/*
 * Output: 
 * 1 2 3 4 5  
 	 7 8 9 10
  	   13 14 15
   		  19 20
    		 25
 */
class DiagonalDisplay {
	public static void main(String[] args) {
		int[][] array = {
				{ 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 }
		};
		int upperarray[][] = new int[5][5];
		int i, j;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i <= j) {
					upperarray[i][j] = array[i][j];
				} else
					upperarray[i][j] = 0;
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (upperarray[i][j] == 0)
					System.out.print(" ");
				else
					System.out.print(upperarray[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
