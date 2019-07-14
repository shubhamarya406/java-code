package recursion_print_L10;

public class print_permutation {

	public static void main(String[] args) {
		printperm("abc", "");

	}

	public static void printperm(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;

		}
		char ch = que.charAt(0);
		String roq = que.substring(1);

		for (int i = 0; i <= ans.length(); i++)
			printperm(roq, ans.substring(0, i) + ch + ans.substring(i));
	}
}
