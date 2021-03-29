package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.concrete_handler;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.Request;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.handler.Handler;

public class HealthHandler extends Handler {

	public HealthHandler(String apiEndPoint) {
		super(apiEndPoint);
	}

	@Override
	protected boolean handerImp(Request request) {
		if (request.getApiEndPoint().equals(super.apiEndPoint)) {
			System.out.println("HealthHandler handle");
			return true;
		}
		
		return false;
	};
}
