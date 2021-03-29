package challenge.design_patterns.structural_patterns.bridge.window_ex.abstraction;

import challenge.design_patterns.structural_patterns.bridge.window_ex.implementor.WindowImp;

public class IconWindow extends Window {

	public IconWindow(WindowImp windowImp) {
		super(windowImp);
	}

	public void drawBorder() {
		super.drawRect();
		super.drawText();
	}
}
