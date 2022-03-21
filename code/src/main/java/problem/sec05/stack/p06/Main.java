package problem.sec05.stack.p06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(solution(n, k));
	}

	private static int solution(int n, int k) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		int cnt = 1;
		while (q.size() > 1) {
			if (cnt++ == k) {
				q.poll();
				cnt -= k;
			} else
				q.offer(q.poll());
		}
		return q.peek();
	}
}
