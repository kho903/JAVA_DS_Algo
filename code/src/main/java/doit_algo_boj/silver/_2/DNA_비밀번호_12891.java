package doit_algo_boj.silver._2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA_비밀번호_12891 {
	static int S, P;
	static String dna;
	static int[] password, checked;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		S = Integer.parseInt(stk.nextToken());
		P = Integer.parseInt(stk.nextToken());
		stk = new StringTokenizer(br.readLine());
		dna = stk.nextToken();
		password = new int[4];
		checked = new int[4];
		stk = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			password[i] = Integer.parseInt(stk.nextToken());
		}
		System.out.println(solution());
	}

	private static int solution() {
		char[] charDna = dna.toCharArray();
		for (int i = 0; i < P; i++) {
			checkChar(charDna, i);
		}
		canPassword();
		for (int i = P; i < S; i++) {
			minusChar(charDna, i);
			checkChar(charDna, i);
			canPassword();
		}

		return cnt;
	}

	private static void minusChar(char[] charDna, int i) {
		if (charDna[i - P] == 'A') checked[0]--;
		else if (charDna[i - P] == 'C') checked[1]--;
		else if (charDna[i - P] == 'G') checked[2]--;
		else if (charDna[i - P] == 'T') checked[3]--;
	}

	private static void checkChar(char[] charDna, int i) {
		if (charDna[i] == 'A') checked[0]++;
		else if (charDna[i] == 'C') checked[1]++;
		else if (charDna[i] == 'G') checked[2]++;
		else if (charDna[i] == 'T') checked[3]++;
	}

	private static void canPassword() {
		boolean p = true;
		for (int i = 0; i < 4; i++) {
			if (checked[i] < password[i]) {
				p = false;
				break;
			}
		}
		if (p) cnt++;
	}
}
