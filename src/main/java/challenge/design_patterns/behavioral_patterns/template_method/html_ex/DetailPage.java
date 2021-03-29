package challenge.design_patterns.behavioral_patterns.template_method.html_ex;

public class DetailPage extends PageTemplate {

	@Override
	protected void showBody() {
		System.out.println("Content of detail");
	}
}