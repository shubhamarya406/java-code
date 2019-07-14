package rec_backtracking;

public class print_permutation {

	public static void main(String[] args) {
		pp("abca", "");
		System.out.println();

	}

	public static void pp(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean visited[]=new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			if(visited[ch])
				continue;
			pp(ros, ans + ch);
			visited[ch]=true;
		}
	}
}
