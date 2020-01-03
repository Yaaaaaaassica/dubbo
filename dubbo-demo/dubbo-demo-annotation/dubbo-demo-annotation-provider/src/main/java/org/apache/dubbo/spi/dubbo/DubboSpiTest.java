package org.apache.dubbo.spi.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class DubboSpiTest {

    public static void main(String[] args) {

        ExtensionLoader<Fuck> loader = ExtensionLoader.getExtensionLoader(Fuck.class);

        Fuck fuck = loader.getAdaptiveExtension();

        fuck.fuck();

    }
}
