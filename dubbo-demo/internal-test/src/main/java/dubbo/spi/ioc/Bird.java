package dubbo.spi.ioc;

import org.apache.dubbo.common.URL;

public class Bird implements CanFly {

    @Override
    public void canfly(URL unused) {
        System.out.println(" I can fly");

    }
}
