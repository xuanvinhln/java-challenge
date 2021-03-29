package challenge.design_patterns.structural_patterns.bridge.window_ex.abstraction;

import challenge.design_patterns.structural_patterns.bridge.window_ex.implementor.WindowImp;

public abstract class Window {
	protected WindowImp windowImp;

	public Window(WindowImp windowImp) {
		this.windowImp = windowImp;
	}

	public void drawText() {
		System.out.println("Window drawText");
		this.windowImp.devDrawText();
	}

	public void drawRect() {
		System.out.println("Window drawRect");
		this.windowImp.devDrawLine();
		this.windowImp.devDrawLine();
		this.windowImp.devDrawLine();
		this.windowImp.devDrawLine();
	}
}
