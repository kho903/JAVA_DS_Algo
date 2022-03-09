package problem.sec02array.p01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// my solution
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] intArray = new int[num];
		for (int i = 0; i < num; i++) {
			intArray[i] = sc.nextInt();
		}
		System.out.print(intArray[0] + " ");
		for (int i = 1; i < intArray.length; i++) {
			if (intArray[i - 1] < intArray[i]) {
				System.out.print(intArray[i] + " ");
			}
		}
	}*/

	// lecture
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

	private static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1])
				answer.add(arr[i]);
		}
		return answer;
	}

}
