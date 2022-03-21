package problem.sec05.stack.p07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// lecture - queue
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String required = sc.next();
		String plan = sc.next();
		System.out.println(solution(required, plan));
	}

	private static String solution(String required, String plan) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		for (char x : required.toCharArray()) q.offer(x);
		for (char x : plan.toCharArray()) {
			if (q.contains(x)) {
				if (x!= q.poll()) return "NO";
			}
		}

		if (!q.isEmpty()) return "NO";
		return answer;
	}

}
