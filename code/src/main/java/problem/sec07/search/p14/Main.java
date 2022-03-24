package problem.sec07.search.p14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int n, m;
	static ArrayList<ArrayList<Integer>> arr;
	static int[] checked;
	static Map<Integer, Integer> answer = new HashMap<>();
	static int L = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		checked = new int[n + 1];

		arr = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			arr.add(new ArrayList<>());
			if (i != 0 && i != 1)
				answer.put(i, 0);
		}

		for (int i = 1; i <= m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.get(a).add(b);
		}

		for (ArrayList<Integer> arrayList : arr) {
			System.out.println(arrayList.toString());
		}
		dfs(1);
		StringBuilder sb = new StringBuilder();
		for (Integer key : answer.keySet()) {
			sb.append(key).append(" : ").append(answer.get(key)).append("\n");
		}
		System.out.println(sb);
	}

	private static void dfs(int x) {
		Stack<Integer> nextT = new Stack<>();
		for (Integer t : arr.get(x)) {
			if (t == 1) {

			} else if (checked[t] == 0) {
				checked[t] = 1;
				if (answer.get(t) == 0 || answer.get(t) > L)
					answer.put(t, L);
				nextT.push(t);
				checked[t] = 0;
			}
		}

		for (int i = 0; i < nextT.size(); i++) {
			if (i == 0)
				L++;
			dfs(nextT.pop());
		}

	}
}

/**
 6 9
 1 3
 1 4
 2 1
 2 5
 3 4
 4 5
 4 6
 6 2
 6 5


 2 : 3
 3 : 1
 4 : 1
 5 : 2
 6 : 2
 */