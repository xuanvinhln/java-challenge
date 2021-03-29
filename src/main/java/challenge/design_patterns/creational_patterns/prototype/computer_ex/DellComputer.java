package challenge.design_patterns.creational_patterns.prototype.computer_ex;

public class DellComputer extends ComputerPrototype {
	public String name = "DellComputer";
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

	public DellComputer(String os, String office, String antivirus, String browser) {
		super(os, office, antivirus, browser);
	}

	@Override
	public ComputerPrototype clone() {
		return super.clone();
	}
}
