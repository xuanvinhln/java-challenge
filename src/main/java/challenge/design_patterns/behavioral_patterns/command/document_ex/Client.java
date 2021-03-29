package challenge.design_patterns.behavioral_patterns.command.document_ex;

import challenge.design_patterns.behavioral_patterns.command.document_ex.commands.CenterCommand;
import challenge.design_patterns.behavioral_patterns.command.document_ex.commands.MacroCommand;
import challenge.design_patterns.behavioral_patterns.command.document_ex.commands.NormalSizeCommand;
import challenge.design_patterns.behavioral_patterns.command.document_ex.commands.OpenCommand;
import challenge.design_patterns.behavioral_patterns.command.document_ex.commands.PasteCommand;

public class Client {
	public static void main(String[] args) {
		Document document1 = new Document("document1");

		Application application = new Application();
		application.add(document1);

		OpenCommand openCommand = new OpenCommand(application);
		PasteCommand pasteCommand = new PasteCommand(document1);
		MacroCommand macroCommand = new MacroCommand();
		macroCommand.add(new NormalSizeCommand(document1));
		macroCommand.add(new CenterCommand(document1));

		Menu menu1 = new Menu();
		menu1.add(new MenuItem(openCommand));
		menu1.add(new MenuItem(pasteCommand));
		menu1.add(new MenuItem(macroCommand));
		application.addMenu(menu1);
		
		application.getListMenu().get(0).getListMenuItem().get(0).clicked();
		application.getListMenu().get(0).getListMenuItem().get(1).clicked();
		application.getListMenu().get(0).getListMenuItem().get(2).clicked();
	}
}
