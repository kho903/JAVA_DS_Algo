package Chap01_list.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 11728
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			b.add(sc.nextInt());
		}

		StringBuilder sb = new StringBuilder();
		for (int x : solution(n, m, a, b)) {
			sb.append(x + " ");
		}
		System.out.println(sb.toString());
	}

	private static List<Integer> solution(int n, int m, List<Integer> a, List<Integer> b) {
		List<Integer> answer = new ArrayList<>();
		int n1 = 0, m1 = 0;
		while (n1 < n && m1 < m) {
			if (a.get(n1) <= b.get(m1))
				answer.add(a.get(n1++));
			else
				answer.add(b.get(m1++));
		}
		while (n1 < n)
			answer.add(a.get(n1++));
		while (m1 < m)
			answer.add(b.get(m1++));

		// for (; n1 < n; n1++) {
		// 	answer.add(a.get(n1));
		// }
		// for (; m1 < m; m1++) {
		// 	answer.add(b.get(m1));
		// }
		return answer;
	}
}
