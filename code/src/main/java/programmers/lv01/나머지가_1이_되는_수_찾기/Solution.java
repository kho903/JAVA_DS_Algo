package programmers.lv01.나머지가_1이_되는_수_찾기;

public class Solution {


	public static int solution(int n) {
		int ans = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 1) {
				ans = i;
				break;
			}
		}
		return ans;
	}
}
