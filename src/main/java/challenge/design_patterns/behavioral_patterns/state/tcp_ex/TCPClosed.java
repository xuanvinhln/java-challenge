package challenge.design_patterns.behavioral_patterns.state.tcp_ex;

public class TCPClosed implements TCPState {
	private TCPConnection tcpConnection;

	public TCPClosed(TCPConnection tcpConnection) {
		this.tcpConnection = tcpConnection;
	}

	@Override
	public void open() {
		System.out.println("TCPClosed open");
		this.tcpConnection.setState(tcpConnection.getTcpListen());
	}

	@Override
	public void close() {
		System.out.println("TCPClosed close do nothing");
	}

	@Override
	public void acknowledge() {
		System.out.println("TCPClosed acknowledge");
	}
}
