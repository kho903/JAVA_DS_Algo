package programmers.lv02.영어_끝말잇기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		Map<String, Integer> map = new HashMap<>();
		map.put(words[0] , 1);
		for (int i = 1; i < words.length; i++) {
			if (map.containsKey(words[i]) || (words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1))) {
				answer[0] = i  % n + 1;
				answer[1] = i / n + 1;
				break;
			}
			map.put(words[i], 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(
			solution(
				3, new String[]{
					"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"
				}
			)
		));
		System.out.println(Arrays.toString(
			solution(
				5, new String[]{
					"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"
				}
			)
		));
		System.out.println(Arrays.toString(
			solution(
				2, new String[]{
					"hello", "one", "even", "never", "now", "world", "draw"
				}
			)
		));
	}
}
