package challenge.design_patterns.creational_patterns.prototype.editormusic_ex.prototype;

public class WholeNote extends MusicalNote {
	@Override
	public void draw(int position) {
		System.out.println("WholeNote draw");
	}

	@Override
	public Graphic clone() {
		return super.clone();
	}
}
