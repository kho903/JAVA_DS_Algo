package basic_algo;

/**
 * M 이상 N 이하의 수가 나열되어 순서에 상관없이 나열되어 있다고 할 때
 * 각 수가 몇개 인지 세어보는 방법
 */
public class Counting {
	public static void main(String[] args) {
		int[] people = {55, 40, 27, 99, 76, 81, 29, 31, 33, 62};
		int[] ages = new int[10]; //연령대에 따른 수 세기

		for (int i = 0; i < people.length; i++) {
			int age = people[i];
			if (age < 30) ages[0]++;
			else if (age < 40) ages[1]++;
			else if (age < 50) ages[2]++;
			else if (age < 60) ages[3]++;
			else if (age < 70) ages[4]++;
			else if (age < 80) ages[5]++;
			else if (age < 90) ages[6]++;
			else if (age <= 100) ages[7]++;
		}
		int number = people.length;

		System.out.printf("%d명 중 20대는 %d명 입니다.\n", number, ages[0]);
		System.out.printf("%d명 중 30대는 %d명 입니다.\n", number, ages[1]);
		System.out.printf("%d명 중 40대는 %d명 입니다.\n", number, ages[2]);
		System.out.printf("%d명 중 50대는 %d명 입니다.\n", number, ages[3]);
		System.out.printf("%d명 중 60대는 %d명 입니다.\n", number, ages[4]);
		System.out.printf("%d명 중 70대는 %d명 입니다.\n", number, ages[5]);
		System.out.printf("%d명 중 80대는 %d명 입니다.\n", number, ages[6]);
		System.out.printf("%d명 중 90대는 %d명 입니다.\n", number, ages[7]);
	}
}
