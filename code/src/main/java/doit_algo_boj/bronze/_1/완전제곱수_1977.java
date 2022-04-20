package doit_algo_boj.bronze._1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 완전제곱수_1977 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		List<Integer> arr = new ArrayList<>();
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int x = i * i;
			if (M <= x && x <= N) {
				arr.add(x);
				sum += x;
			}
		}

		Collections.sort(arr);

		if (arr.isEmpty()) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
	}
}
