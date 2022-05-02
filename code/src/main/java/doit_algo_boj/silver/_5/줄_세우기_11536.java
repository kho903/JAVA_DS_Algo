package doit_algo_boj.silver._5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 줄_세우기_11536 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] input = new String[n];

		for (int i = 0; i < n; i++)
			input[i] = sc.next();

		String[] sortInput = input.clone();
		Arrays.sort(sortInput);
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (!input[i].equals(sortInput[i])) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("INCREASING");
		} else {
			flag = true;
			Arrays.sort(sortInput, Comparator.reverseOrder());
			for (int i = 0; i < n; i++) {
				if (!input[i].equals(sortInput[i])) {
					flag = false;
					System.out.println("NEITHER");
					break;
				}
			}
			if (flag)
				System.out.println("DECREASING");
		}
	}
}
