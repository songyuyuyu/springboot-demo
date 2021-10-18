package com.song_yu.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;
import java.util.Date;

/**
 * @author:
 * @date:
 */
public class NettyServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        // 1. ��ȡ����
        ByteBuf byteBuf = (ByteBuf) msg;
        System.out.println(new Date() + ": ����˶������� -> " + byteBuf.toString(Charset.forName("utf-8")));
        System.out.println(new Date() + ": �����д������");
        // 2. д����
        ByteBuf out = getByteBuf(ctx);
        ctx.channel().writeAndFlush(out);
    }

    private ByteBuf getByteBuf(ChannelHandlerContext ctx) {
        byte[] bytes = "���Ƿ��͸��ͻ��˵����ݣ�����������!".getBytes(Charset.forName("utf-8"));
        ByteBuf buffer = ctx.alloc().buffer();
        buffer.writeBytes(bytes);
        return buffer;
    }
}
