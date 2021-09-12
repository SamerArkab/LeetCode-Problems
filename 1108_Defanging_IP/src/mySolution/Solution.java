package mySolution;

class Solution {
	public String defangIPaddr(String address) {
		String ans = "";

		for (int i = 0; i < address.length(); i++) {
			char temp = address.charAt(i);

			if (temp == '.')
				ans += "[.]";
			else
				ans += temp;
		}

		return ans;
	}
}