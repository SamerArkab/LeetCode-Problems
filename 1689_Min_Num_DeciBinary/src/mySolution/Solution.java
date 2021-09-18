package mySolution;

class Solution {
	public int minPartitions(String n) {
		char maxNum = '0';
		char[] n1 = n.toCharArray();
		for (int i = 0; i < n1.length; i++) {
			if (maxNum < n1[i])
				maxNum = n1[i];
		}
		return Integer.parseInt(String.valueOf(maxNum));
	}
}