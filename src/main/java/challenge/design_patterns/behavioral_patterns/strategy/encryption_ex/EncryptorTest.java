package challenge.design_patterns.behavioral_patterns.strategy.encryption_ex;

/*
 * Strategy (EncryptionStrategy): Is an interface common to all supported algorithm-specific classes.
 * ConcreteStrategy (AesEncryptionStrategy and BlowfishEncryptionStrategy): Implements the algorithm using the Strategy interface.
 * Context (Encryptor): Provides the interface to client for encrypting data. The Context maintains
 *  a reference to a Strategy object and is instantiated and initialized by clients with a ConcreteStrategy object.
 */
public class EncryptorTest {
	public static void main(String[] args) {
		EncryptionStrategy aesStrategy = new AesEncryptionStrategy();
		Encryptor aesEncryptor = new Encryptor(aesStrategy);
		aesEncryptor.setPlainText("This is plain text");
		aesEncryptor.encrypt();

		EncryptionStrategy blowfishStrategy = new BlowfishEncryptionStrategy();
		Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy);
		blowfishEncryptor.setPlainText("This is plain text");
		blowfishEncryptor.encrypt();
	}
}