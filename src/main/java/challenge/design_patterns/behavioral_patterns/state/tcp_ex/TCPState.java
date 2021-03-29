package challenge.design_patterns.behavioral_patterns.state.tcp_ex;

public interface TCPState {
	void open();

	void close();

	void acknowledge();
}
