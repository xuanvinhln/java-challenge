package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex;

import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.concrete_handler.DefaultHandler;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.concrete_handler.ExceptionHandler;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.concrete_handler.HealthHandler;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.concrete_handler.MetricHandler;
import challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex.handler.Handler;

public class Client {
	public static String metricEndpoint = "/metric";
	public static String healthEndpoint = "/health";
	public static String exceptionEndpoint = "/exception";

	public static void showList(Handler handler) {
		Handler current = handler;

		while (current != null) {
			System.out.println("showList " + current.getApiEndPoint() + " pointer: " + current);
			current = current.getNextHandler();
		}
	}

	public static void main(String[] args) {
		Handler handler = new MetricHandler(metricEndpoint);
		handler.addHandler(new HealthHandler(healthEndpoint));
		handler.addHandler(new ExceptionHandler(exceptionEndpoint));
		handler.addHandler(new ExceptionHandler("/exceptionEndpoint2"));
		handler.addHandler(new DefaultHandler("/default"));
		System.out.println("Add handler done");

		Request request = new Request(metricEndpoint);
		handler.handle(request);

		request.setApiEndPoint("abc");
		handler.handle(request);

		request.setApiEndPoint(exceptionEndpoint);
		handler.handle(request);

		request.setApiEndPoint(healthEndpoint);
		handler.handle(request);

	}
}
