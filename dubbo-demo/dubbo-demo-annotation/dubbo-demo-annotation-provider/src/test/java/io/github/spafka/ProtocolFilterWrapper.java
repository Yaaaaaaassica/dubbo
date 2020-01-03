package io.github.spafka;


/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  org.apache.dubbo.common.URL
 *  org.apache.dubbo.common.extension.ExtensionLoader
 *  org.apache.dubbo.rpc.Exporter
 *  org.apache.dubbo.rpc.Filter
 *  org.apache.dubbo.rpc.Invoker
 *  org.apache.dubbo.rpc.Protocol
 *  org.apache.dubbo.rpc.RpcException
 *  org.apache.dubbo.rpc.protocol.ProtocolFilterWrapper$1
 *  org.apache.dubbo.rpc.protocol.ProtocolFilterWrapper$CallbackRegistrationInvoker
 */


import java.util.List;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.RpcException;


public class ProtocolFilterWrapper implements Protocol {
    private final Protocol protocol;

    public ProtocolFilterWrapper(Protocol protocol) {
        if (protocol == null) {
            throw new IllegalArgumentException("protocol == null");
        }
        this.protocol = protocol;
    }

    private static <T> Invoker<T> buildInvokerChain(Invoker<T> invoker, String key, String group) {
        Invoker last = invoker;
        List filters = ExtensionLoader.getExtensionLoader(Filter.class).getActivateExtension(invoker.getUrl(), key, group);
        if (!filters.isEmpty()) {
            for (int i = filters.size() - 1; i >= 0; --i) {
                Filter filter = (Filter)filters.get(i);
                Invoker next = last;
               // last = new /* Unavailable Anonymous Inner Class!! */;
            }
        }
        return new org.apache.dubbo.rpc.protocol.ProtocolFilterWrapper.CallbackRegistrationInvoker(last, filters);
    }

    public int getDefaultPort() {
        return this.protocol.getDefaultPort();
    }

    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        if ("registry".equals(invoker.getUrl().getProtocol())) {
            return this.protocol.export(invoker);
        }
        return this.protocol.export(ProtocolFilterWrapper.buildInvokerChain(invoker, "service.filter", "provider"));
    }

    public <T> Invoker<T> refer(Class<T> type, URL url) throws RpcException {
        if ("registry".equals(url.getProtocol())) {
            return this.protocol.refer(type, url);
        }
        return ProtocolFilterWrapper.buildInvokerChain(this.protocol.refer(type, url), "reference.filter", "consumer");
    }

    public void destroy() {
        this.protocol.destroy();
    }
}

