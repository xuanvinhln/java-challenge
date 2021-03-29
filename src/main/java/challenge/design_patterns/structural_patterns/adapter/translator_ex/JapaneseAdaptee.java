package challenge.design_patterns.structural_patterns.adapter.translator_ex;

public class JapaneseAdaptee {
	public void receive(String words) {
		System.out.println("Receiving words from Adapter ... ");
		System.out.println(words);
	}
}
