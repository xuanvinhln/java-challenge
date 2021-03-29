package challenge.test;

public class B extends A {
	@Override
	public void draw() {
		System.out.println("Class B");
	}
	
	public static void main(String[] args) {
		B b = new B();
		A a = (A) b;
		a.draw();
		b.draw();
		
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		
		A a1 = new A();
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof A);
	}
}
