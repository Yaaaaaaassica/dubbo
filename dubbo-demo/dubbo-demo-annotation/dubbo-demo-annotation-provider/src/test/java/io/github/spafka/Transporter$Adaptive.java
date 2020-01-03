package io.github.spafka;

/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  org.apache.dubbo.common.URL
 *  org.apache.dubbo.common.extension.ExtensionLoader
 *  org.apache.dubbo.rpc.Exporter
 *  org.apache.dubbo.rpc.Invoker
 *  org.apache.dubbo.rpc.Protocol
 *  org.apache.dubbo.rpc.RpcException
 */

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.remoting.*;


public class Transporter$Adaptive
        implements Transporter {
    public Client connect(URL uRL, ChannelHandler channelHandler) throws RemotingException {
        if (uRL == null) {
            throw new IllegalArgumentException("url == null");
        }
        URL uRL2 = uRL;
        String string = uRL2.getParameter("client", uRL2.getParameter("transporter", "netty"));
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Failed to get extension (org.apache.dubbo.remoting.Transporter) name from url (").append(uRL2.toString()).append(") use keys([client, transporter])").toString());
        }
        Transporter transporter = (Transporter) ExtensionLoader.getExtensionLoader(Transporter.class).getExtension(string);
        return transporter.connect(uRL, channelHandler);
    }

    public Server bind(URL uRL, ChannelHandler channelHandler) throws RemotingException {
        if (uRL == null) {
            throw new IllegalArgumentException("url == null");
        }
        URL uRL2 = uRL;
        String string = uRL2.getParameter("server", uRL2.getParameter("transporter", "netty"));
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Failed to get extension (org.apache.dubbo.remoting.Transporter) name from url (").append(uRL2.toString()).append(") use keys([server, transporter])").toString());
        }
        Transporter transporter = (Transporter) ExtensionLoader.getExtensionLoader(Transporter.class).getExtension(string);
        return transporter.bind(uRL, channelHandler);
    }
}

