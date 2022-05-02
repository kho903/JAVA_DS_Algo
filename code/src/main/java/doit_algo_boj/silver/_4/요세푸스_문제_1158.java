package doit_algo_boj.silver._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스_문제_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(stk.nextToken());
		int k = Integer.parseInt(stk.nextToken());

		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}

		ArrayList<Integer> ans = new ArrayList<>();
		sb.append("<");
		while (!q.isEmpty()) {
			for (int i = 1; i < k; i++)
				q.offer(q.poll());
			ans.add(q.poll());
		}
		for (int i = 0; i < ans.size(); i++) {
			if (i == ans.size() - 1)
				sb.append(ans.get(i));
			else {
				sb.append(ans.get(i)).append(", ");
			}
		}
		sb.append(">");

		System.out.println(sb);
	}
}
