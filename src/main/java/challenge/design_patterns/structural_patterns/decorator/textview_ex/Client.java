package challenge.design_patterns.structural_patterns.decorator.textview_ex;

public class Client {
	public static void main(String[] args) {
		VisualComponent textView = new TextView();
		
		textView = new ScrollDecorator(textView);
		textView = new BorderDecorator(textView);

		textView.draw();
	}
}
