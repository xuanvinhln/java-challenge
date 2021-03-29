package challenge.design_patterns.behavioral_patterns.state.tcp_ex;

public class TCPListen implements TCPState {
	TCPConnection tcpConnection;

	public TCPListen(TCPConnection tcpConnection) {
		this.tcpConnection = tcpConnection;
	}

	@Override
	public void open() {
		System.out.println("TCPListen open");
		tcpConnection.setState(tcpConnection.getTcpEstablished());
	}

	@Override
	public void close() {
		System.out.println("TCPListen close");
		tcpConnection.setState(tcpConnection.getTcpClosed());
	}

	@Override
	public void acknowledge() {
		System.out.println("TCPListen acknowledge");
	}
}
