package challenge.design_patterns.behavioral_patterns.template_method.html_ex;

public class HomePage extends PageTemplate {

	@Override
	protected void showBody() {
		System.out.println("Content of home page page");
	}
}