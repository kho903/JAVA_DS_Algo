package doit_algo_boj.gold._4;

import java.util.ArrayList;
import java.util.Scanner;

public class 거짓말_1043 {
	static int[] arr;
	static int[] tPeople;
	static ArrayList<Integer>[] party;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int T = sc.nextInt();
		tPeople = new int[T];
		for (int i = 0; i < T; i++) {
			tPeople[i] = sc.nextInt();
		}
		party = new ArrayList[M];
		for (int i = 0; i < M; i++) {
			party[i] = new ArrayList<>();
			int partyNum = sc.nextInt();
			for (int j = 0; j < partyNum; j++) {
				party[i].add(sc.nextInt());
			}
		}

		arr = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < M; i++) {
			int R = party[i].get(0);
			for (int j = 1; j < party[i].size(); j++) {
				union(R, party[i].get(j));
			}
		}

		int ans = 0;
		for (int i = 0; i < M; i++) {
			boolean p = true;
			int cur = party[i].get(0);
			for (int t : tPeople) {
				if (find(cur) == find(t)) {
					p = false;
					break;
				}
			}
			if (p) ans++;
		}

		System.out.println(ans);
	}

	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b) arr[b] = a;
	}

	private static int find(int a) {
		if (a == arr[a]) return a;
		else return arr[a] = find(arr[a]);
	}


}
