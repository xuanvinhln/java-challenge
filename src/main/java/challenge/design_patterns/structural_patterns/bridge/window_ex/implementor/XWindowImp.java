package challenge.design_patterns.structural_patterns.bridge.window_ex.implementor;

public class XWindowImp implements WindowImp {

	@Override
	public void devDrawText() {
		System.out.println("XWindowImp DevDrawText");

	}

	@Override
	public void devDrawLine() {
		System.out.println("XWindowImp DevDrawLine");
	}
}
