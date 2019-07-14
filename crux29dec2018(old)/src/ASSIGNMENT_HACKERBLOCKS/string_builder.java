package ASSIGNMENT_HACKERBLOCKS;

public class string_builder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello");
		System.out.println(sb);
      sb.setCharAt(2,'w');
      System.out.println(sb);
      sb.append('a');
      System.out.println(sb);
      sb.append("abc");
      System.out.println(sb);
      sb.delete(2, 4);
      System.out.println(sb);
	}

}
