package challenge.design_patterns.creational_patterns.builder.rtf_reader_ex.product;

public class TextWidget {
	private StringBuilder stringBuilder = new StringBuilder();

	public void append(char c) {
		stringBuilder.append(c);
	}

	public void show() {
		System.out.println("TextWidget: " + stringBuilder.toString());
	}
}
