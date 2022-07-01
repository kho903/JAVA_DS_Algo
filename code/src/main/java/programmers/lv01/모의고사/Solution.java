package programmers.lv01.모의고사;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static int[] solution(int[] answers) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] a = new int[]{1,2,3,4,5};
		int[] b = new int[]{2,1,2,3,2,4,2,5};
		int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};
		int[] student1 = new int[answers.length];
		int[] student2 = new int[answers.length];
		int[] student3 = new int[answers.length];
		int[] count = new int[3];
		for (int i = 0; i < answers.length; i++) {
			student1[i] = a[i % a.length];
			student2[i] = b[i % b.length];
			student3[i] = c[i % c.length];
			if (answers[i] == student1[i]) count[0]++;
			if (answers[i] == student2[i]) count[1]++;
			if (answers[i] == student3[i]) count[2]++;
		}
		int max = Arrays.stream(count).max().getAsInt();
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) answer.add(i);
		}

		int[] ans = new int[answer.size()];
		// for (int i = 0; i < ans.length; i++)
		// 	ans[i] = answer.get(i) + 1;
		Arrays.setAll(ans, i -> answer.get(i) + 1);

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(solution(new int[] {1, 3, 2, 4, 2})));
	}
}
