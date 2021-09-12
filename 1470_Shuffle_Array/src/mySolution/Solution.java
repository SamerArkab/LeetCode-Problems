package mySolution;

class Solution {
	public int[] shuffle(int[] nums, int n) {
		int[] ans = new int[n * 2];

		for (int i = 0; i < n * 2; i += 2) {
			ans[i] = nums[i / 2]; // x
			ans[i + 1] = nums[i / 2 + n]; // y
		}

		return ans;
	}
}