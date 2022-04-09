package doit_algo_boj.silver._2;

import java.util.Scanner;

public class 잃어버린_괄호_1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] minus = s.split("-");
		int ans = 0;
		for (int i = 0; i < minus.length; i++) {
			String[] split = minus[i].split("[+]");
			int cur = 0;
			for (int j = 0; j < split.length; j++) {
				cur += Integer.parseInt(split[j]);
			}
			if (i == 0) ans += cur;
			else ans -= cur;
		}
		System.out.println(ans);
	}
}
