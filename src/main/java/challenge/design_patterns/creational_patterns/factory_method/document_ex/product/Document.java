package challenge.design_patterns.creational_patterns.factory_method.document_ex.product;

public abstract class Document {
	public abstract void Open();

	public abstract void Close();

	public abstract void Save();

	public abstract void Revert();
}
