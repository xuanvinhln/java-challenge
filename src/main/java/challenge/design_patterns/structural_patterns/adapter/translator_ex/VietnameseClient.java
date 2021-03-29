package challenge.design_patterns.structural_patterns.adapter.translator_ex;

public class VietnameseClient {
	public static void main(String[] args) {
		VietnameseTarget vietnameseTarget = new TranslatorAdapter(new JapaneseAdaptee());
		vietnameseTarget.send("Hello Viet Nam");
	}
}
