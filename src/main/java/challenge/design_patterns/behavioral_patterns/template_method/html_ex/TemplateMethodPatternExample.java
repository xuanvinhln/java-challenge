package challenge.design_patterns.behavioral_patterns.template_method.html_ex;

public class TemplateMethodPatternExample {
	public static void main(String[] args) {

		PageTemplate homePage = new HomePage();
		homePage.showPage();

		System.out.println();
		PageTemplate detailPage = new DetailPage();
		detailPage.showPage();

		System.out.println();
		PageTemplate contactPage = new ContactPage();
		contactPage.showPage();
	}
}
