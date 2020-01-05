package dubbo.spi.ioc;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("man")
public interface CanSpeek {

    @Adaptive("man")
    void canSpeek();

}
