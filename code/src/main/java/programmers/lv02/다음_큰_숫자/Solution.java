package programmers.lv02.다음_큰_숫자;

public class Solution {
	public static int solution(int n) {

		String binaryN = Integer.toBinaryString(n);
		while (true) {
			String nextBinary = Integer.toBinaryString(++n);
			if (compareOne(binaryN, nextBinary)) break;
		}
		return n;
	}

	private static boolean compareOne(String n, String next) {
		int nCount = 0;
		int nextCount = 0;
		for (char c : n.toCharArray()) {
			if (c == '1') nCount++;
		}

		for (char c : next.toCharArray()) {
			if (c == '1') nextCount++;
		}
		return nCount == nextCount;
	}

	public static void main(String[] args) {
		System.out.println(solution(78));
		System.out.println(solution(15));
	}
}
