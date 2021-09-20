package mySolution;

class Solution {
	public int[] kWeakestRows(int[][] mat, int k) {
		int[] counter = new int[mat.length];
		int[] index = new int[mat.length];
		int temp = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1)
					temp++;
				else
					break;
			}
			counter[i] = temp;
			index[i] = i;
			temp = 0;
		}

		temp = 0;
		for (int i = 0; i < counter.length - 1; i++) { // Bubble sorting
			for (int j = 0; j < counter.length - 1 - i; j++) {

				if (counter[j] > counter[j + 1]) {
					temp = counter[j];
					counter[j] = counter[j + 1];
					counter[j + 1] = temp;
					temp = index[j];
					index[j] = index[j + 1];
					index[j + 1] = temp;
				}

				else if (counter[j] == counter[j + 1] && index[j] > index[j + 1]) {
					temp = counter[j];
					counter[j] = counter[j + 1];
					counter[j + 1] = temp;
					temp = index[j];
					index[j] = index[j + 1];
					index[j + 1] = temp;
				}
			}
		}

		int[] ret = new int[k];
		for (int i = 0; i < k; i++)
			ret[i] = index[i];

		return ret;

	}
}