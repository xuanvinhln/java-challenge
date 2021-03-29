package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.concrete_handler;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.LogLevel;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.handler.Logger;

public class ConsoleLogger extends Logger {
	public ConsoleLogger(LogLevel logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println("Console logger: " + msg);
	}
}
