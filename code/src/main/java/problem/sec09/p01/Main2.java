package problem.sec09.p01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Player> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(new Player(a, b));
		}
		System.out.println(solution(n, arr));
	}

	private static int solution(int n, ArrayList<Player> arr) {
		int cnt = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for (Player player : arr) {
			if (player.weight > max) {
				max = player.weight;
				cnt++;
			}
		}
		return cnt;
	}
}

class Player implements Comparable<Player> {
	int height;
	int weight;

	public Player(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Player o) {
		return o.height - this.height;
	}
}