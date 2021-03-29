package challenge.design_patterns.structural_patterns.composite.file_ex;

public class FileLeaf extends FileComponent {
	private String name;
	private long size;

	public FileLeaf(String name, long size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void showProperty() {
		System.out.println("FileLeaf [name=" + name + ", size=" + size + "]");
	}

	@Override
	public long totalSize() {
		return size;
	}
}
