package challenge.design_patterns.creational_patterns.prototype.editormusic_ex.prototype;

public abstract class Graphic implements Cloneable {
	public abstract void draw(int position);

	public Graphic clone() {
		try {
			return (Graphic) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
