package doit_algo_boj.gold._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 이분_그래프_1707 {
	static int V, E;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int K = Integer.parseInt(br.readLine());

		for (int i = 0; i < K; i++) {
			String[] s = br.readLine().split(" ");
			V = Integer.parseInt(s[0]);
			E = Integer.parseInt(s[1]);
			arr = new ArrayList[V + 1];
			for (int x = 0; x < V + 1; x++) {
				arr[x] = new ArrayList<>();
			}
		}
	}
}
