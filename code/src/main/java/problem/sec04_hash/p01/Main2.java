package problem.sec04_hash.p01;

import java.util.HashMap;
import java.util.Scanner;

// lecture
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(n, str));
	}

	private static char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for (char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		// hashmap 팁
		System.out.println(map.containsKey('A')); // true
		System.out.println(map.containsKey('F')); // false
		System.out.println(map.size());
		System.out.println(map.remove('A')); // key 삭제
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			// System.out.println(key + " " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
}
