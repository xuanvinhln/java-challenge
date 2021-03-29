package challenge.design_patterns.creational_patterns.prototype.structure;

public class ConcretePrototype1 implements Prototype {
	@Override
	public Prototype clone() {
		try {
			return (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return null;
	}
}
