package challenge.design_patterns.creational_patterns.prototype.editormusic_ex.prototype;

public class Staff extends Graphic {

	@Override
	public void draw(int position) {
		System.out.println("Staff draw: position: " + position);
	}

	@Override
	public Graphic clone() {
		return super.clone();
	}
}
