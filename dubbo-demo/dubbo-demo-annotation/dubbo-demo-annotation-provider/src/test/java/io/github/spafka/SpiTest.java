package io.github.spafka;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.remoting.Transporter;
import org.apache.dubbo.rpc.Protocol;
import org.junit.jupiter.api.Test;


public class SpiTest {

    @Test
    public void testAdaptive() throws Exception{
        ExtensionLoader<Transporter> transporterExtensionLoader = ExtensionLoader.getExtensionLoader(Transporter.class);
        Transporter adaptiveExtension = transporterExtensionLoader.getAdaptiveExtension();
        System.out.println(adaptiveExtension.getClass());

        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);

        Protocol adaptiveExtension1 = extensionLoader.getAdaptiveExtension();

        System.out.println(adaptiveExtension.getClass());

        System.in.read();
    }
}
