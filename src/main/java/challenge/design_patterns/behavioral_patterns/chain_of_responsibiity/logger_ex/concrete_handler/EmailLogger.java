package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.concrete_handler;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.LogLevel;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.handler.Logger;

public class EmailLogger extends Logger {

	public EmailLogger(LogLevel logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println("Email logger: " + msg);
	}
}