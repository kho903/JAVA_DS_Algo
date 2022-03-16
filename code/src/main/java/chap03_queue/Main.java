package chap03_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2164
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		while (q.size() > 1) {
			q.poll();
			q.add(q.poll());
		}

		return q.peek();
	}

}
