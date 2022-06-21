package programmers.lv02.위장;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int solution(String[][] clothes) {
		Map<String, Integer> map = new HashMap<>();
		for (String[] clothe : clothes) {
			map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
		}
		int answer = 1;
		for (String s : map.keySet()) {
			answer *= (map.get(s) + 1);
		}
		return answer - 1;
	}

	public static void main(String[] args) {
		System.out.println(solution(new String[][] {
			{"yellohat", "headgear"},
			{"bluesunglasses", "eyewear"},
			{"green_turban", "headgear"}
		}));
	}
}
