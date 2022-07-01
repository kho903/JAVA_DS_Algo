package programmers.lv01.폰켓몬;

import java.util.ArrayList;

public class Solution {

	public static int solution(int[] nums) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int num : nums) {
			if (!arr.contains(num))
				arr.add(num);
		}
		return Math.min(nums.length / 2, arr.size());
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,1,2,3}));
		System.out.println(solution(new int[] {3,3,3,2,2,4}));
		System.out.println(solution(new int[] {3,3,3,2,2,2}));
	}
}
