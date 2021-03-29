package challenge.test;

public class IntegerIsImmutable {
	public static void inc(Integer x) {
		x++;
		System.out.println("n=" + x);
	}

	public static void main(String argv[]) {

		Integer x = Integer.valueOf(17);
		inc(x);
		System.out.print("x=" + x);
	}
}
