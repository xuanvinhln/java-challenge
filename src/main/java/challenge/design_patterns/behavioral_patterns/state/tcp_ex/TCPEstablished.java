package challenge.design_patterns.behavioral_patterns.state.tcp_ex;

public class TCPEstablished implements TCPState {
	private TCPConnection tcpConnection;

	public TCPEstablished(TCPConnection tcpConnection) {
		this.tcpConnection = tcpConnection;
	}

	@Override
	public void open() {
		System.out.println("TCPEstablished open do nothing");
	}

	@Override
	public void close() {
		System.out.println("TCPEstablished close");
		tcpConnection.setState(tcpConnection.getTcpClosed());
	}

	@Override
	public void acknowledge() {
		System.out.println("TCPEstablished acknowledge");
	}
}
