package mySolution;

class Solution {
	public int kthSmallest(int[][] matrix, int k) {
		// Binary Search
		int l = matrix[0][0], r = matrix[matrix.length - 1][matrix.length - 1], mid = 0;

		while (l < r) {
			mid = l + (r - l) / 2;
			if (selectCount(mid, matrix) < k)
				l = mid + 1;
			else
				r = mid;
		}

		return l;
	}

	private int selectCount(int mid, int[][] mat) {
		int counter = 0, row = 0, col = mat.length - 1;
		while (row < mat.length && col >= 0) {
			if (mat[row][col] > mid)
				col--;
			else {
				counter = counter + col + 1;
				row++;
			}
		}

		return counter;
	}
}