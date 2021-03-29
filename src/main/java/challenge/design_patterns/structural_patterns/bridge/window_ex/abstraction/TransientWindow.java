package challenge.design_patterns.structural_patterns.bridge.window_ex.abstraction;

import challenge.design_patterns.structural_patterns.bridge.window_ex.implementor.WindowImp;

public class TransientWindow extends Window {

	public TransientWindow(WindowImp windowImp) {
		super(windowImp);
	}
	
	public void drawCloseBox() {
		super.drawRect();
	}
}
