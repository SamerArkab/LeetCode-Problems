package mySolution;

class Solution {
	public int maximumWealth(int[][] accounts) {
		int ans = 0, temp = 0;
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[i].length; j++) {
				temp += accounts[i][j];
			}
			ans = Math.max(temp, ans);
			temp = 0;
		}
		return ans;
	}
}