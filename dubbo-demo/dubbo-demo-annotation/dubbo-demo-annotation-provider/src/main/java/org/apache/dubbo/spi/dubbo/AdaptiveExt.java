package org.apache.dubbo.spi.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface AdaptiveExt {

    @Adaptive
    String echo(String msg, URL url);
}