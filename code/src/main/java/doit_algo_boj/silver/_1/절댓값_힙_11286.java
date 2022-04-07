package doit_algo_boj.silver._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 절댓값_힙_11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
			int absO1 = Math.abs(o1);
			int absO2 = Math.abs(o2);
			if (absO1 == absO2)
				return o1 > o2 ? 1: -1;
			else return absO1 - absO2;
		});
		while (N-- > 0) {
			int x = Integer.parseInt(bf.readLine());
			if (x != 0) {
				q.add(x);
			} else {
				if (q.isEmpty())
					sb.append(0).append("\n");
				else {
					sb.append(q.poll()).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
