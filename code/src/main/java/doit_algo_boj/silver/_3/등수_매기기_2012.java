package doit_algo_boj.silver._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 등수_매기기_2012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int rank = 1;
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += Math.abs(rank++ - arr[i]);
		}

		System.out.println(ans);
	}
}
