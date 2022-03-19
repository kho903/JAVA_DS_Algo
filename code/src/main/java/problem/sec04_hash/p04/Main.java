package problem.sec04_hash.p04;

import java.util.HashMap;
import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(solution(s, t));
	}

	private static int solution(String s, String t) {
		int answer = 0;

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		HashMap<Character, Integer> tMap = new HashMap<>();
		for (char c : tChar) {
			tMap.put(c, tMap.getOrDefault(c, 0) + 1);
		}
		int rt = tChar.length - 1;
		for (int i = 0; i < rt; i++) {
			tMap.put(sChar[i], tMap.getOrDefault(sChar[i], 0) - 1);
			if (tMap.get(sChar[i]) == 0) tMap.remove(sChar[i]);
		}

		for (int i = rt; i < sChar.length; i++) {
			tMap.put(sChar[i], tMap.getOrDefault(sChar[i], 0) - 1);
			if (tMap.get(sChar[i]) == 0) tMap.remove(sChar[i]);
			if (tMap.isEmpty()) answer++;
			tMap.put(sChar[i - rt], tMap.getOrDefault(sChar[i - rt], 0) + 1);
			if (tMap.get(sChar[i - rt]) == 0) tMap.remove(sChar[i - rt]);
		}
		return answer;
	}
}
