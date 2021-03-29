package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.concrete_handler.ConsoleLogger;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.concrete_handler.EmailLogger;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.concrete_handler.FileLogger;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.logger_ex.handler.Logger;

public class AppLogger {
	public static Logger getLogger() {
		Logger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
		Logger fileLogger = consoleLogger.setNext(new FileLogger(LogLevel.ERROR));
		fileLogger.setNext(new EmailLogger(LogLevel.FATAL));
		
		return consoleLogger;
	}
}