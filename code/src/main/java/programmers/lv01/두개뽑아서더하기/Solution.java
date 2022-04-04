package programmers.lv01.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		System.out.println(Arrays.toString(solution(numbers)));
		numbers = new int[] {5, 0, 2, 7};
		System.out.println(Arrays.toString(solution(numbers)));

	}

	public static int[] solution(int[] numbers) {
		ArrayList<Integer> arr = new ArrayList<>();

		int n = numbers.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int value = numbers[i] + numbers[j];
				if (!arr.contains(value)) arr.add(value);
			}
		}

		int[] answer = new int[arr.size()];
		int i = 0;
		for (Integer x : arr)
			answer[i++] = x;

		Arrays.sort(answer);
		return answer;
	}
}
