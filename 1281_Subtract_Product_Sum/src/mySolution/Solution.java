package mySolution;

class Solution {
	public int subtractProductAndSum(int n) {
		int num = 0, prod = 1, sum = 0;

		while (n > 0) {
			num = n % 10;
			n /= 10;
			sum += num;
			prod *= num;
		}

		return (prod - sum);
	}
}