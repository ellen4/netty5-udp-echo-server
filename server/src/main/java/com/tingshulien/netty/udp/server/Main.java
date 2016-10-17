package com.tingshulien.netty.udp.server;

import io.netty.channel.ChannelFuture;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException();
        }

        int port = Integer.parseInt(args[0]);

        NettyUdpServer server = null;

        try {
            server = new NettyUdpServer(port);
            ChannelFuture future = server.start();

            // Wait until the connection is closed.
            future.channel().closeFuture().sync();
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
