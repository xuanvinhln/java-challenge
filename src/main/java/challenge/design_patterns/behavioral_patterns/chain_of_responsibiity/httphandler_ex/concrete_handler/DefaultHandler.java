package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.concrete_handler;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.Request;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.handler.Handler;

public class DefaultHandler extends Handler {

	public DefaultHandler(String apiEndPoint) {
		super(apiEndPoint);
	}

	@Override
	protected boolean handerImp(Request request) {
		System.out.println("DefaultHandler handle");
		return true;
	};
}
