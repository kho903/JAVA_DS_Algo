package doit_algo_boj.gold._4;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 카드_정렬하기_1715 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			q.add(sc.nextInt());
		}
		int sum = 0, a = 0, b = 0;
		while (q.size() != 1) {
			a = q.remove();
			b = q.remove();
			sum += a + b;
			q.add(a + b);
		}
		System.out.println(sum);
	}
}
