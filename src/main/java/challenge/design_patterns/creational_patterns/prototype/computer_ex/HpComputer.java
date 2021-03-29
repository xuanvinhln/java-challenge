package challenge.design_patterns.creational_patterns.prototype.computer_ex;

public class HpComputer extends ComputerPrototype {
	public String name = "HpComputer";
	public String others;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String toString() {
		return super.toString() + ", name: " + name + ", other: " + others;
	}

	public HpComputer(String os, String office, String antivirus, String browser) {
		super(os, office, antivirus, browser);
	}

	@Override
	public ComputerPrototype clone() {
		return super.clone();
	}
}
