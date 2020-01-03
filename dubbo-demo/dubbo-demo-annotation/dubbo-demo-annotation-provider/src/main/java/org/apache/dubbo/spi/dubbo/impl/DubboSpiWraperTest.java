package org.apache.dubbo.spi.dubbo.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.spi.dubbo.AdaptiveExt;
import org.apache.dubbo.spi.dubbo.Fuck;

import java.io.IOException;

public class DubboSpiWraperTest {

    public static void main(String[] args) throws IOException {

        ExtensionLoader<Fuck> loader = ExtensionLoader.getExtensionLoader(Fuck.class);

        Fuck fuck = loader.getExtension("girl");

        fuck.fuck();

        System.out.println(fuck.getClass());
    }
}
