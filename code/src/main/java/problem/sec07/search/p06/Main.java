package problem.sec07.search.p06;

public class Main {
	static int n;
	static int[] ch;

	public static void main(String[] args) {
		n = 3;
		ch = new int[n + 1];
		dfs(1);
	}

	private static void dfs(int L) {
		if (L == n + 1) {
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i < ch.length; i++)
				if(ch[i] == 1) sb.append(i).append(" ");
			if (sb.length() > 0) System.out.println(sb);
		} else {
			ch[L] = 1;
			dfs(L + 1);
			ch[L] = 0;
			dfs(L + 1);
		}
	}
}
