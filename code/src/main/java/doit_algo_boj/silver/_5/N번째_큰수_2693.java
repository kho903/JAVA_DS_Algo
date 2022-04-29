package doit_algo_boj.silver._5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class N번째_큰수_2693 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer stk;
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			stk = new StringTokenizer(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			for (int i = 0; i < 10; i++)
				arr.add(Integer.parseInt(stk.nextToken()));
			arr.sort(Collections.reverseOrder());
			sb.append(arr.get(2)).append("\n");
		}

		System.out.println(sb);
	}
}
