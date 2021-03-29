package challenge.design_patterns.structural_patterns.proxy.structure;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("RealSubject request");
	}

}
