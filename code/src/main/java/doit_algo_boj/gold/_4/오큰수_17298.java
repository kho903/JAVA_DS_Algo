package doit_algo_boj.gold._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 오큰수_17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(bf.readLine());
		int[] A = new int[N];
		String[] str = bf.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		Stack<Integer> stack = new Stack<>();
		int[] ans = new int[N];
		stack.push(0);
		for (int i = 1; i < N; i++) {
			while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		for (int x : ans) {
			sb.append(x).append(" ");
		}
		System.out.println(sb);
	}
}
