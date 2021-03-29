package challenge.design_patterns.creational_patterns.builder.pizza_ex;

public class Pizza {
	private String dough;
	private String sauce;
	private String topping;

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	public void showInfo() {
		System.out.println("Pizza Info");
		System.out.println("Dough: " + dough);
		System.out.println("Sauce: " + sauce);
		System.out.println("Topping: " + topping);
	}
}
