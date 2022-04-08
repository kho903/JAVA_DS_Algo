package doit_algo_boj.gold._4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 수_묶기_1744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minus = new PriorityQueue<>();
		int zero = 0;
		int one = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x == 0) zero++;
			else if (x == 1) one++;
			else if (x < 0) minus.add(x);
			else plus.add(x);
		}

		int sum = 0;
		while (plus.size() > 1) {
			Integer a = plus.remove();
			Integer b = plus.remove();
			sum += (a * b);
		}
		if (!plus.isEmpty()) sum += plus.poll();
		while (minus.size() > 1) {
			Integer a = minus.remove();
			Integer b = minus.remove();
			sum += (a * b);
		}
		if (!minus.isEmpty()) {
			if (zero == 0) sum += minus.remove();
		}

		System.out.println(sum + one);
	}
}
