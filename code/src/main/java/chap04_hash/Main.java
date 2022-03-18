package chap04_hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 1920
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> a = new HashSet<>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		int m = sc.nextInt();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int b = sc.nextInt();
			if (a.contains(b)) result.append(1 + "\n");
			else result.append(0 + "\n");
		}
		System.out.println(result.toString());
	}
}
