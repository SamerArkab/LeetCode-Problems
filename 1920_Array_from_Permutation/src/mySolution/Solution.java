package mySolution;

class Solution {
	public int[] buildArray(int[] nums) {
		int[] temp = nums;
		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = temp[nums[i]];
		}

		return ans;
	}
}