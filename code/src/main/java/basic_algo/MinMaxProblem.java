package basic_algo;

public class MinMaxProblem {

	public static void main(String[] args) {
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

		int min = numbers[0];
		int max = numbers[0];

		int minPos = 0;
		int maxPos = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
				minPos = i;
			}
			if (max < numbers[i]) {
				max = numbers[i];
				maxPos = i;
			}
		}


		System.out.printf("min = %d, min position = %d\n", min, minPos);
		System.out.printf("max = %d, max position = %d\n", max, maxPos);
	}
}
