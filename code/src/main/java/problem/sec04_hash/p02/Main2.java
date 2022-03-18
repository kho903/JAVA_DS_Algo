package problem.sec04_hash.p02;

import java.util.HashMap;
import java.util.Scanner;

// lecture
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(solution(a, b));
	}

	private static String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for (char x : s2.toCharArray()) {
			if (!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x) - 1);
		}
		return answer;
	}
}
