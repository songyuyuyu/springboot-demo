package com.song_yu.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.EventExecutorGroup;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.Random;

/**
 * @author:
 * @date:
 */
public class NettyClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        System.out.println(new Date() + ": �ͻ���д������");

        // 1. ��ȡ����
        ByteBuf buffer = getByteBuf(ctx);

        // 2. д����
        ctx.channel().writeAndFlush(buffer);
    }

    /**
     * ���ݽ���
     */
    private ByteBuf getByteBuf(ChannelHandlerContext ctx) {
        // 1. ��ȡ�����Ƴ��� ByteBuf
        ByteBuf buffer = ctx.alloc().buffer();
        Random random = new Random();
        double value = random.nextDouble() * 14 + 8;
        String temp = "��ȡ�����¶ȣ�" + value;

        // 2. ׼�����ݣ�ָ���ַ������ַ���Ϊ utf-8
        byte[] bytes = temp.getBytes(Charset.forName("utf-8"));

        // 3. ������ݵ� ByteBuf
        buffer.writeBytes(bytes);

        return buffer;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        System.out.println(new Date() + ": �ͻ��˶������� -> " + msg.toString());
    }

}