package basic_algo;

public class InsertionSort {

	public static void insertionSort(int[] arr, int count) {
		int temp = 0;
		int j = 0;

		for (int i = 1; i < count; i++) {
			temp = arr[i];
			j = i;
			while ((j > 0) && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;

			System.out.println("반복 - " + i);
			printSort(arr, count);
		}
	}

	public static void printSort(int[] value, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(value[i] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};
		insertionSort(arr, 8);
		/*
		반복 - 1
		50	80	70	10	60	20	40	30
		반복 - 2
		50	70	80	10	60	20	40	30
		반복 - 3
		10	50	70	80	60	20	40	30
		반복 - 4
		10	50	60	70	80	20	40	30
		반복 - 5
		10	20	50	60	70	80	40	30
		반복 - 6
		10	20	40	50	60	70	80	30
		반복 - 7
		10	20	30	40	50	60	70	80
		 */
	}
}
