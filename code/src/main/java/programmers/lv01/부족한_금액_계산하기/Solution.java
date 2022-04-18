package programmers.lv01.부족한_금액_계산하기;

public class Solution {
	public static long solution(int price, int money, int count) {
		long total = 0;

		for (long i = 1; i <= count; i++) {
			total += i * price;
		}

		if (total < money) return 0;
		else return total - money;
	}
}
