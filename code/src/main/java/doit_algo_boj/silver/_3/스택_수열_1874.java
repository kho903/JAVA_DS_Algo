package doit_algo_boj.silver._3;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class 스택_수열_1874 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Stack<Integer> stack = new Stack<>();
		boolean flag = true;
		int num = 1;
		for (int i = 0; i < n; i++) {
			int cur = arr[i];
			if (cur >= num) {
				while (cur >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				Integer pop = stack.pop();
				if (pop > cur) {
					System.out.println("NO");
					flag = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}

		if (flag) {
			System.out.println(sb.toString());
		}
	}
}
