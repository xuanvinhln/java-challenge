package challenge.design_patterns.behavioral_patterns.memento.object_ex;

public class ShadowTest {

	private int x = 0;

	class FirstLevel {

		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
		}
	}

	public static void main(String... args) {
		ShadowTest st = new ShadowTest();
		ShadowTest.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}