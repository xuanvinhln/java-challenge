package challenge.design_patterns.behavioral_patterns.state.tcp_ex;

public class TCPConnection {
	private TCPEstablished tcpEstablished;
	private TCPListen tcpListen;
	private TCPClosed tcpClosed;
	private TCPState state;

	public TCPConnection() {
		this.tcpEstablished = new TCPEstablished(this);
		this.tcpListen = new TCPListen(this);
		this.tcpClosed = new TCPClosed(this);
		this.state = tcpClosed;
	}

	public void open() {
		this.getState().open();
	}

	public void close() {
		this.getState().close();
	}

	public void acknowledge() {
		this.getState().acknowledge();
	}

	public TCPState getState() {
		return state;
	}

	public void setState(TCPState state) {
		this.state = state;
	}

	public TCPEstablished getTcpEstablished() {
		return tcpEstablished;
	}

	public TCPListen getTcpListen() {
		return tcpListen;
	}

	public TCPClosed getTcpClosed() {
		return tcpClosed;
	}
}
