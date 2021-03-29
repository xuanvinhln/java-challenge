package challenge.design_patterns.creational_patterns.prototype.editormusic_ex.prototype;

public class HalfNote extends MusicalNote {
	@Override
	public void draw(int position) {
		System.out.println("HalfNote draw");
	}

	@Override
	public Graphic clone() {
		return super.clone();
	}
}
