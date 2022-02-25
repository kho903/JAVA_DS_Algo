package basic_algo;

/**
 * 가게에서 8370원 어치 물건 구매
 * 500원 20개 100원 20개 50원 20개 10원 20개
 * 단위가 큰 동전부터 지불
 * 각 동전의 갯수?
 */
public class Greedy {

	public static void main(String[] args) {
		int[] coins = {500, 100, 50, 10};
		int price = 8370;
		int count;

		for (int coin : coins) {
			count = 0;
			count += price / coin;
			price = price % coin;

			System.out.printf("%d원짜리 동전 %d개가 필요합니다\n", coin, count);
		}
	}
}
