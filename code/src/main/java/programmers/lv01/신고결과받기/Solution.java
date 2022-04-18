package programmers.lv01.신고결과받기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] {"muzi", "frodo", "apeach", "neo"}, new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2)));
		System.out.println(Arrays.toString(solution(new String[] {"con", "ryan"}, new String[] {"ryan con", "ryan con", "ryan con", "ryan con"}, 3)));
	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, Integer> map = new HashMap<>();
		Map<String, List<Integer>> arr=  new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			map.put(id_list[i], i);
		}

		for (String s : report) {
			String[] split = s.split(" ");
			String from = split[0];
			String to = split[1];
			if (!arr.containsKey(to)) arr.put(to, new ArrayList<>());
			List<Integer> cur = arr.get(to);
			if (!cur.contains(map.get(from))) cur.add(map.get(from));
		}

		for (int i = 0; i < id_list.length; i++) {
			String id = id_list[i];
			if (arr.containsKey(id) && arr.get(id).size() >= k) {
				for (Integer x : arr.get(id)) {
					answer[x]++;
				}
			}
		}
		return answer;
	}
}
