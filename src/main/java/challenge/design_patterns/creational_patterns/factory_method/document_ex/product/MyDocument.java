package challenge.design_patterns.creational_patterns.factory_method.document_ex.product;

public class MyDocument extends Document {
	@Override
	public void Open() {
		System.out.println("Open MyDocument document");
	}

	@Override
	public void Close() {
		System.out.println("Close MyDocument document");
	}

	@Override
	public void Save() {
		System.out.println("Save MyDocument document");
	}

	@Override
	public void Revert() {
		System.out.println("Revert MyDocument document");
	}
}
