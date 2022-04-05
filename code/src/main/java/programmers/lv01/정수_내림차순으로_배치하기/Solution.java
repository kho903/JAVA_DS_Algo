package programmers.lv01.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}

	public static long solution(long n) {
		String[] s = String.valueOf(n).split("");
		Arrays.sort(s, Comparator.reverseOrder());
		String ans = String.join("", s);
		return Long.parseLong(ans);
	}
}
