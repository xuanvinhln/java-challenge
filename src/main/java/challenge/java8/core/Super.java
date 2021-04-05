package challenge.java8.core;

public class Super {
	public final Integer integer;
	
	private Super(int i) {
		this.integer = null;
	}
	
	public void run() {
	}

	public class Sub extends Super {
		public Sub(int i) {
			super(i);
		}
	}
}
