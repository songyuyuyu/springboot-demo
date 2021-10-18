package com.song_yu.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author:
 * @date:
 */
public class NettyClient {
    private static String host = "127.0.0.1";
    private static int MAX_RETRY = 5;

    public static void main(String[] args) {
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap
                // 1.ָ���߳�ģ��
                .group(workerGroup)
                // 2.ָ�� IO ����Ϊ NIO
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .option(ChannelOption.TCP_NODELAY, true)
                // 3.IO �����߼�
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch) {
                        ch.pipeline()
                                .addLast(new IdleStateHandler(0, 10, 0))
                                .addLast(new StringDecoder())
                                .addLast(new StringEncoder())
                                .addLast(new NettyClientHandler());
                    }
                });

        // 4.��������
        bootstrap.connect(host, 8070).addListener(future -> {
            if (future.isSuccess()) {
                System.out.println("���ӳɹ�!");
            } else {
                System.err.println("����ʧ��!");
                connect(bootstrap, host, 80, MAX_RETRY);
            }

        });
    }

    private static void connect(Bootstrap bootstrap, String host, int port, int retry) {
        bootstrap.connect(host, port).addListener(future -> {
        if (future.isSuccess()) {
            System.out.println("���ӳɹ�!");
        } else if (retry == 0) {
            System.err.println("���Դ��������꣬�������ӣ�");
        } else {
            // �ڼ�������
            int order = (MAX_RETRY - retry) + 1;
            // ���������ļ��
            int delay = 1 << order;
            System.err.println(new Date() + ": ����ʧ�ܣ���" + order + "����������");
            bootstrap.config().group().schedule(() -> connect(bootstrap, host, port, retry - 1), delay, TimeUnit
                    .SECONDS);
        }
    });
    }
}
