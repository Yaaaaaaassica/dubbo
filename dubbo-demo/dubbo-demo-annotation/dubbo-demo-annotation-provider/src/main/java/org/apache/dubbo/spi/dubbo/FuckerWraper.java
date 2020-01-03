package org.apache.dubbo.spi.dubbo;

public class FuckerWraper implements Fuck {

    Fuck fuck;

    public FuckerWraper(Fuck fuck) {
        this.fuck = fuck;
    }

    public void setFuck(Fuck fuck) {
        this.fuck = fuck;
    }

    @Override
    public void fuck() {

        System.out.println("===================");
        System.out.println("fucker wraper");
        System.out.println("===================");

        fuck.fuck();
        System.out.println("fucker wraper done!");
        System.out.println("===================");


    }
}
