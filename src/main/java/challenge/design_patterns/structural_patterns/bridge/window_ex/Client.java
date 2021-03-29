package challenge.design_patterns.structural_patterns.bridge.window_ex;

import challenge.design_patterns.structural_patterns.bridge.window_ex.abstraction.IconWindow;
import challenge.design_patterns.structural_patterns.bridge.window_ex.abstraction.TransientWindow;
import challenge.design_patterns.structural_patterns.bridge.window_ex.abstraction.Window;
import challenge.design_patterns.structural_patterns.bridge.window_ex.implementor.PMWindowImp;
import challenge.design_patterns.structural_patterns.bridge.window_ex.implementor.XWindowImp;

public class Client {
	public static void main(String[] args) {
		Window window = new IconWindow(new XWindowImp());
		window.drawRect();

		window = new TransientWindow(new PMWindowImp());
		window.drawText();
	}
}
