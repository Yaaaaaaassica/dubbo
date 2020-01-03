package org.apache.dubbo.spi.dubbo;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("man")
public interface Fuck {

   @Adaptive
    void fuck();
}
