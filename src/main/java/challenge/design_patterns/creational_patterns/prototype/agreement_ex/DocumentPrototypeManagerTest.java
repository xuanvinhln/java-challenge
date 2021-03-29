package challenge.design_patterns.creational_patterns.prototype.agreement_ex;

/*
 * Prototype (PrototypeCapableDocument): Is a Java interface or abstract class that defines the contract for classes that permits cloning of its objects.
 * 
 * ConcretePrototype (TAndC and NDAgreement): Are classes that provide operations to clone its objects.
 * 
 * PrototypeManager (DocumentPrototypeManager): A class that implements a registry to manage available prototypes for clients.
 *  On a client request, this class creates a copy of a prototype.
 * 
 * Client: Asks the PrototypeManager for copies of prototypes.
 */

public class DocumentPrototypeManagerTest {
	public static void main(String[] args) {
		PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
		clonedTAndC.setVendorName("Mary Parker");
		System.out.println(clonedTAndC);

		PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
		clonedNDA.setVendorName("Patrick Smith");
		System.out.println(clonedNDA);
	}
}