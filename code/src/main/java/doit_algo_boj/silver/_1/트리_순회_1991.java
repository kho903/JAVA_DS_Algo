package doit_algo_boj.silver._1;

import java.util.Scanner;

public class 트리_순회_1991 {
	static int[][] tree;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		tree = new int[26][2];
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			String[] s = sc.nextLine().split(" ");
			char c = s[0].charAt(0);
			char left = s[1].charAt(0);
			char right = s[2].charAt(0);

			if (left != '.') tree[c - 'A'][0] = left - 'A';
			if (right != '.') tree[c - 'A'][1] = right - 'A';

		}

		preorder(0);
		System.out.println();
		inorder(0);
		System.out.println();
		postorder(0);
	}


	private static void preorder(int x) {
		System.out.print((char)(x + 'A'));
		if (tree[x][0] != 0) preorder(tree[x][0]);
		if (tree[x][1] != 0) preorder(tree[x][1]);
	}

	private static void inorder(int x) {
		if (tree[x][0] != 0) inorder(tree[x][0]);
		System.out.print((char)(x + 'A'));
		if (tree[x][1] != 0) inorder(tree[x][1]);
	}

	private static void postorder(int x) {
		if (tree[x][0] != 0) postorder(tree[x][0]);
		if (tree[x][1] != 0) postorder(tree[x][1]);
		System.out.print((char)(x + 'A'));

	}
}
