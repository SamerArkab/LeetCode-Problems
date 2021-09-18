package mySolution;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		List<Boolean> ret = new ArrayList<Boolean>();

		for (int j = 0; j < candies.length; j++)
			if (max < candies[j])
				max = candies[j];

		for (int i = 0; i < candies.length; i++)
			candies[i] += extraCandies;

		for (int k = 0; k < candies.length; k++) {
			ret.add(k, false);
			if (max <= candies[k]) {
				ret.remove(k);
				ret.add(k, true);
			}
		}

		return ret;
	}
}