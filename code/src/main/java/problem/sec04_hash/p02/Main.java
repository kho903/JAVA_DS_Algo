package problem.sec04_hash.p02;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(solution(s1, s2));
	}

	private static String solution(String s1, String s2) {
		ConcurrentHashMap<Character, Integer> m1 = new ConcurrentHashMap<>();
		for (char s : s1.toCharArray()) {
			m1.put(s, m1.getOrDefault(s, 0) + 1);
		}

		ConcurrentHashMap<Character, Integer> m2 = new ConcurrentHashMap<>();
		for (char s : s2.toCharArray()) {
			m2.put(s, m2.getOrDefault(s, 0) + 1);
		}

		for (char ch : m1.keySet()) {
			if (m2.containsKey(ch)) {
				if (!m1.get(ch).equals(m2.get(ch))) {
					return "NO";
				} else {
					m1.remove(ch);
					m2.remove(ch);
				}
			} else {
				return "NO";
			}
		}
		if (m1.isEmpty() && m2.isEmpty())
			return "YES";
		else
			return "NO";
	}
}
