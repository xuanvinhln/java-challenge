package challenge.design_patterns.behavioral_patterns.strategy.encryption_ex;

public class Encryptor {
	private EncryptionStrategy strategy;
	private String plainText;

	public Encryptor(EncryptionStrategy strategy) {
		this.strategy = strategy;
	}

	public void encrypt() {
		strategy.encryptData(plainText);
	}

	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}
}