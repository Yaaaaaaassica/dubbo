package org.apache.dubbo.spi.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.io.IOException;

public class DubboSpiTest2 {

    public static void main(String[] args) throws IOException {

        ExtensionLoader<AdaptiveExt> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);

        AdaptiveExt adaptiveExt = loader.getAdaptiveExtension();

        URL url = URL.valueOf("test://localhost/test?adaptive.ext=spring");
        System.out.println(adaptiveExt.echo("d", url));
    }
}
