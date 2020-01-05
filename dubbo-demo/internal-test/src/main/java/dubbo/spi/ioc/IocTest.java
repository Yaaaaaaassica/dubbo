package dubbo.spi.ioc;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class IocTest {

    @Test
    public void _1(){

        CanSpeek speek = ExtensionLoader.getExtensionLoader(CanSpeek.class).getDefaultExtension();

        System.out.println(speek);

    }

    @Test
    public void _2(){

        CanSpeek speek = ExtensionLoader.getExtensionLoader(CanSpeek.class).getAdaptiveExtension();

        System.out.println(speek);

    }

    @Test
    public void _3(){

        CanSpeek speek = ExtensionLoader.getExtensionLoader(CanSpeek.class).getExtension("man");

        System.out.println(speek);

    }

}
