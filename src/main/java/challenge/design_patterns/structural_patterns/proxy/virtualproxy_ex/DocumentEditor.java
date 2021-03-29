package challenge.design_patterns.structural_patterns.proxy.virtualproxy_ex;

import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
	private List<Graphic> list = new ArrayList<Graphic>();
	
	public void addGraphic(Graphic g) {
		System.out.println(g.getExtent());
		g.draw();
		this.list.add(g);
		
		System.out.println(g.getExtent());
		g.draw();
	}
	
	public static void main(String[] args) {
//		DocumentEditor d = new DocumentEditor();
//		d.addGraphic(new ImageProxy("fileName"));
		
		System.out.println("Init proxy image: ");
        ImageProxy proxyImage = new ImageProxy("https://gpcoder.com/favicon.ico");
         
        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.draw();
         
        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.draw();
	}
}
