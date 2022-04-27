package doit_algo_boj.bronze._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2007년 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");

		int month = Integer.parseInt(s[0]);
		int day = Integer.parseInt(s[1]);

		String[] mon = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int index = day;
		for (int i = 0; i < month - 1; i++) {
			index += d[i];
		}

		index %= 7;

		System.out.println(mon[index]);
	}
}
