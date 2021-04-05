package challenge.java8.core;

public class ReturnFromFinally {
	public static int test1() {
		try {
			return 1;
		} catch (Exception e) {
		} finally {
			return 2;
		}
	}

	public static void main(String[] args) {
		System.out.println(ReturnFromFinally.test1());
	}
}
