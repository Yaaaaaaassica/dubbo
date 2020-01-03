package org.apache.dubbo.spi.java;

import java.util.ServiceLoader;

public class JavaSpiTest {


    public static void main(String[] args) {

        ServiceLoader<Fuck> fucks = ServiceLoader.load(Fuck.class);

        fucks.forEach(x->{
            x.fuck();
        });


    }







}


