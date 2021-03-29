package challenge.design_patterns.behavioral_patterns.state.tcp_ex;

public class Client {
	public static void main(String[] args) {
		TCPConnection tcpConnection = new TCPConnection();
		tcpConnection.acknowledge();

		tcpConnection.open();
		tcpConnection.acknowledge();

		tcpConnection.open();
		tcpConnection.acknowledge();

		tcpConnection.close();
		tcpConnection.acknowledge();
	}
}
