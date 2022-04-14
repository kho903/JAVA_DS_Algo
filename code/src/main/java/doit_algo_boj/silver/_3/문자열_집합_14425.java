package doit_algo_boj.silver._3;

import java.util.Scanner;

public class 문자열_집합_14425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		Trie trie = new Trie();
		while (N-- > 0) {
			String s = sc.next();
			Trie cur = trie;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (cur.next[c - 'a'] == null) {
					cur.next[c - 'a'] = new Trie();
				}
				cur = cur.next[c - 'a'];
				if (i == s.length() - 1) cur.isEnd = true;
			}
		}

		int cnt = 0;
		while (M-- > 0) {
			String s = sc.next();
			Trie cur = trie;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (cur.next[c - 'a'] == null) break;
				cur = cur.next[c - 'a'];
				if (i == s.length() - 1 && cur.isEnd) cnt++;
 			}
		}
		System.out.println(cnt);
	}

	static class Trie {
		Trie[] next = new Trie[26];
		boolean isEnd;
	}
}
