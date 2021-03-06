package challenge.netty.tcp.client;

import java.net.InetSocketAddress;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class Client {
	public void run() throws Exception {
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap clientBootstrap = new Bootstrap();

			clientBootstrap.group(group);
			clientBootstrap.channel(NioSocketChannel.class);
			clientBootstrap.remoteAddress(new InetSocketAddress("localhost", 9999));
			clientBootstrap.handler(new ChannelInitializer<SocketChannel>() {
				protected void initChannel(SocketChannel socketChannel) throws Exception {
					socketChannel.pipeline().addLast(new ClientHandler());
				}
			});

			try {
				ChannelFuture channelFuture = clientBootstrap.connect().sync();
				channelFuture.channel().closeFuture().sync();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} finally {
			try {
				group.shutdownGracefully().sync();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Client start");
		Client client = new Client();
		client.run();
	}
}
