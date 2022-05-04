package doit_algo_boj.silver._5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 생일_5635 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		int n = Integer.parseInt(br.readLine());
		List<Student> studentList = new ArrayList<>();
		while (n-- > 0) {
			stk = new StringTokenizer(br.readLine());
			String name = stk.nextToken();
			int dd = Integer.parseInt(stk.nextToken());
			int mm = Integer.parseInt(stk.nextToken());
			int yyyy = Integer.parseInt(stk.nextToken());
			studentList.add(new Student(name, dd, mm, yyyy));
		}

		studentList.sort((o1, o2) -> {
			if (o1.yyyy == o2.yyyy) return o1.mm - o2.mm;
			else if (o1.mm == o2.mm) return o1.dd - o2.dd;
			return o1.yyyy - o2.yyyy;
		});

		System.out.println(studentList.get(studentList.size() - 1).name);
		System.out.println(studentList.get(0).name);
	}

	static class Student {
		String name;
		int dd;
		int mm;
		int yyyy;

		public Student(String name, int dd, int mm, int yyyy) {
			this.name = name;
			this.dd = dd;
			this.mm = mm;
			this.yyyy = yyyy;
		}
	}
}
