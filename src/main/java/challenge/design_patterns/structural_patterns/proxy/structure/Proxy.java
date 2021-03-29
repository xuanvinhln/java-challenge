package challenge.design_patterns.structural_patterns.proxy.structure;

public class Proxy implements Subject {
	private RealSubject realSubject;
	private String pathRealSubject;

	public Proxy(String pathRealSubject) {
		this.pathRealSubject = pathRealSubject;
	}

	@Override
	public void request() {
		if (this.realSubject == null) {
			System.out.println(this.pathRealSubject);
			this.realSubject = new RealSubject();
		}
		
		System.out.println("Proxy request");
		this.realSubject.request();
	}
}
