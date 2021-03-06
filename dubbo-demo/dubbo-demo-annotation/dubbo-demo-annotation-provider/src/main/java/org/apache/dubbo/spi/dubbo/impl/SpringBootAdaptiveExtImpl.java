package org.apache.dubbo.spi.dubbo.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.spi.dubbo.AdaptiveExt;

public class SpringBootAdaptiveExtImpl implements AdaptiveExt {

    @Override
    public String echo(String msg, URL url) {
        return "spring boot";
    }
}