import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.spi.dubbo.Fuck;

import java.io.IOException;

//@see https://www.jianshu.com/p/4df584e9b493
public class DubboSpiWraperTest {

    public static void main(String[] args) throws IOException {

        ExtensionLoader<Fuck> loader = ExtensionLoader.getExtensionLoader(Fuck.class);

        Fuck fuck = loader.getExtension("girl");

        // fuckerwraper 实例，如果spi的类有其父类的构造方法，则其为wrapper类，构造时则注入我们的name的类，返回此wrapper类。
        fuck.fuck();


        System.out.println(fuck.getClass());

        Fuck defaultExtension = loader.getDefaultExtension();
        defaultExtension.fuck();
        System.out.println(defaultExtension.getClass());
    }
}
