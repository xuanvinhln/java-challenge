package challenge.design_patterns.structural_patterns.bridge.window_ex.implementor;

public class PMWindowImp implements WindowImp {

	@Override
	public void devDrawText() {
		System.out.println("PMWindowImp DevDrawText");

	}

	@Override
	public void devDrawLine() {
		System.out.println("PMWindowImp DevDrawLine");
	}
}
