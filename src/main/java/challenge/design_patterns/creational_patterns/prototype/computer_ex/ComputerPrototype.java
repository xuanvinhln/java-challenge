package challenge.design_patterns.creational_patterns.prototype.computer_ex;

public abstract class ComputerPrototype implements Cloneable {
	private String os;
	private String office;
	private String antivirus;
	private String browser;

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOffice() {
		return office;
	}

	public ComputerPrototype(String os, String office, String antivirus, String browser) {
		super();
		this.os = os;
		this.office = office;
		this.antivirus = antivirus;
		this.browser = browser;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getAntivirus() {
		return antivirus;
	}

	public void setAntivirus(String antivirus) {
		this.antivirus = antivirus;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String toString() {
		return "Computer [os=" + os + ", office=" + office + ", antivirus=" + antivirus + ", browser=" + browser + "]";
	}

	public ComputerPrototype clone() {
		Object computer = null;
		try {
			computer = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (ComputerPrototype) computer;
	}
}
