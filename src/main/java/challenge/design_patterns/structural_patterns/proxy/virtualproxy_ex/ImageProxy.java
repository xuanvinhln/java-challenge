package challenge.design_patterns.structural_patterns.proxy.virtualproxy_ex;

public class ImageProxy implements Graphic {
	private Image realImage;
	private String url;
	private String extent = "extent of ImageProxy";

	public ImageProxy(String url) {
		this.url = url;
		System.out.println("Image unloaded: " + this.url);
	}

	@Override
	public void draw() {
		if (this.realImage == null) {
			this.realImage = this.loadImage(url);
		} else {
			System.out.println("Image already existed: " + this.url);
		}

		this.realImage.draw();
	}

	@Override
	public String getExtent() {
		if (this.realImage == null) {
			return extent;
		} else {
			return this.realImage.getExtent();
		}
	}

	@Override
	public void store() {
		System.out.println("ImageProxy store ");
		if (this.realImage == null) {
			this.realImage = this.loadImage(url);
		}

		this.realImage.store();
	}

	@Override
	public void load() {
		System.out.println("ImageProxy load ");
		if (this.realImage == null) {
			this.realImage = this.loadImage(url);
		}

		this.realImage.load();
	}

	private Image loadImage(String path) {
		System.out.println("ImageProxy loadImage " + path);
		return new Image(path);
	}
}
