package problem.sec04_hash.p01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = sc.next().split("");
		System.out.println(solution(n, arr));
	}

	private static String solution(int n, String[] arr) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			// getOrDefault로 refactor 가능
			if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
			else map.put(arr[i], 1);
		}

		int maxValue = 0;
		String answer = "";
		for (String s : map.keySet()) {
			if (map.get(s) > maxValue) {
				maxValue = map.get(s);
				answer = s;
			}
		}
		return answer;
	}
}
