package challenge.test;

public class Test2 {
	public static void check(String str1, String str2) {
		System.out.println(str1 == str2);
	}

	public static void main(String[] args) {
		String str = new String("abc");
		String str3 = str;
		check(str, str3);
	}
}
