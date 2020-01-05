package dubbo.spi.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("bird")
public interface CanFly {

    @Adaptive
    void canfly(URL url);

}
