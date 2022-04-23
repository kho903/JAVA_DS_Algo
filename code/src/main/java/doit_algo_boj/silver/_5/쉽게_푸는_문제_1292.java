package doit_algo_boj.silver._5;

import java.util.Scanner;

public class 쉽게_푸는_문제_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[1002];
		int num = 1;
		for (int i = 1; i < 1002; i++) {
			for (int j = 0; j < i; j++) {
				if (num == 1001) break;
				arr[num] = i;
				num++;
			}
		}
		int ans = 0;
		for (int i = a; i <= b; i++)
			ans += arr[i];

		System.out.println(ans);
	}
}
