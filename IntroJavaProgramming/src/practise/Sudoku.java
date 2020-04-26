package practise;

public class Sudoku {
	public static void main(String[] args) {
		int[][] sudoku = { { 8, 6, 3, 9, 2, 5, 7, 4, 1 }, { 4, 1, 2, 7, 8, 6, 3, 5, 9 }, { 7, 5, 9, 4, 1, 3, 2, 8, 6 },
				{ 9, 7, 1, 2, 6, 4, 8, 3, 5 }, { 3, 4, 6, 8, 5, 7, 9, 1, 2 }, { 2, 8, 5, 3, 9, 1, 4, 6, 7 },
				{ 1, 9, 8, 6, 3, 2, 5, 7, 4 }, { 5, 2, 4, 1, 7, 8, 6, 9, 3 }, { 6, 3, 7, 5, 4, 9, 1, 2, 8 } };

		//display the results
		System.out.println(isSudokuSolved(sudoku));
	}

	public static boolean isSudokuSolved(int[][] sudoku) {

		// rows and columns
		// count the number of occurrences of each number between 1-9
		for (int i = 0; i < sudoku.length; i++) {
			int[] rowCounts = new int[9];
			int[] colCounts = new int[9];
			for (int j = 0; j < sudoku[i].length; j++) {
				rowCounts[sudoku[i][j] - 1]++;
				colCounts[sudoku[j][i] - 1]++;
			}

			//return false if the count of each number is not equal to 1
			for (int n = 0; n < rowCounts.length; n++) {
				if (rowCounts[n] != 1 || colCounts[n] != 1)
					return false;
			}

		}

		// squares
		for (int x = 0; x < 7; x += 3) {
			for (int y = 0; y < 7; y += 3) {

				int[] boxCount = new int[9];
				for (int i = x; i < x + 3; i++) {
					for (int j = y; j < y + 3; j++) {
						boxCount[sudoku[i][j] - 1]++;
					}
				}

				//return false if the count of each number is not equal to 1
				for (int n : boxCount) {
					if (boxCount[n] != 1)
						return false;
				}
			}
		}

		//return true if this point is reached
		return true;

	}

}