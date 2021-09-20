package mySolution;

class Solution {
	public int countNegatives(int[][] grid) {
		int totalNums = grid.length * grid[0].length, counter = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][0] < 0) { // Sorted - skip all negatives
					i = grid.length; // Break outer loop
					break; // Inner loop
				}

				if (grid[i][j] < 0)
					break;

				counter++;
			}
		}

		return (totalNums - counter);
	}
}