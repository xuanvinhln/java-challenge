package challenge.design_patterns.behavioral_patterns.memento.point_ex;

public class Memento {

	private double x;
	private double y;

	public Memento(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}
