package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.concrete_handler;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.Request;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.handler.Handler;

public class MetricHandler extends Handler {

	public MetricHandler(String apiEndPoint) {
		super(apiEndPoint);
	}

	@Override
	public boolean handerImp(Request request) {
		if (request.getApiEndPoint().equals(super.apiEndPoint)) {
			System.out.println("MetricHandler handle");
			return true;
		}
		
		return false;
	};
}
