package problem.sec04_hash.p05;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < 30; i++) {
			set.add(i);
		}
		System.out.println(set);
		set.remove(28);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println("first : " + set.first());
		System.out.println("last : " + set.last());
	}
}
