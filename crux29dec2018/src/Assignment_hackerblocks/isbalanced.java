package Assignment_hackerblocks;

public class isbalanced {

	public static void main(String[] args) {

	}

	public static void balanced(String str) {
		int arr[] = new int[str.length()];
		int ct = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				arr[ct] = ch;
				ct++;
			}
			if(ch=='}'||ch==']'||ch==')')
			{
				arr[ct]=ch;
				ct++;
			}
		}
     for(int )
	}
}
