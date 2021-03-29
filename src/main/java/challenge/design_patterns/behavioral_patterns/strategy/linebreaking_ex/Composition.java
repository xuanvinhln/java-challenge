package challenge.design_patterns.behavioral_patterns.strategy.linebreaking_ex;

public class Composition {
	private Compositor compositor;

	public Compositor getCompositor() {
		return compositor;
	}

	public void setCompositor(Compositor compositor) {
		this.compositor = compositor;
	}

	public Composition(Compositor compositor) {
		this.compositor = compositor;
	}

	public void repair() {
		this.compositor.compose();
	}
}
