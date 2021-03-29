package challenge.design_patterns.structural_patterns.proxy.virtualproxy_ex;

public class Image implements Graphic {
	private String extent = "extent of Image";
	private String imageImp;
	private String url;

	public Image(String url) {
		this.url = url;
		System.out.println("Image loaded: " + this.url);
	}

	@Override
	public void draw() {
		System.out.println("Image draw " + this.url + this.imageImp);
	}

	@Override
	public String getExtent() {
		System.out.println("Image getExtent " + this.extent);
		return this.extent;
	}

	@Override
	public void store() {
		System.out.println("Image store ");
	}

	@Override
	public void load() {
		System.out.println("Image load ");
	}
}
