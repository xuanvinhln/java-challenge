package challenge.design_patterns.behavioral_patterns.mediator.chat_ex;

public interface ChatMediator {

	void sendMessage(String msg, User user);

	void addUser(User user);
}