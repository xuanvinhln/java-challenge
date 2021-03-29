package challenge.design_patterns.behavioral_patterns.chain_of_responsibiity.httphandler_ex;

public class Request {
	private String apiEndPoint;

	public Request(String apiEndPoint) {
		this.setApiEndPoint(apiEndPoint);
	}

	public String getApiEndPoint() {
		return apiEndPoint;
	}

	public void setApiEndPoint(String apiEndPoint) {
		this.apiEndPoint = apiEndPoint;
	}
}
