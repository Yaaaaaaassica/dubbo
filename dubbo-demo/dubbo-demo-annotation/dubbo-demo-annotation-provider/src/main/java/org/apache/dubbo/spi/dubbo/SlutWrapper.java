package org.apache.dubbo.spi.dubbo;

import org.apache.dubbo.spi.dubbo.Slut;

public class SlutWrapper implements Slut {

    Fuck fuck;

    public void setFuck(Fuck fuck) {
        this.fuck = fuck;
    }

    public SlutWrapper(Fuck fuck) {
        this.fuck = fuck;
    }

    @Override
    public void slut() {

        System.out.println("slut dragon");

        fuck.fuck();

        System.out.println("slut !!!!");

    }
}
