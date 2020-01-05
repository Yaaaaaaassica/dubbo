package dubbo.spi.ioc;

public class Man implements CanSpeek {


    private CanFly fly;

    public void setFly(CanFly fly) {
        this.fly = fly;
    }

    @Override
    public void canSpeek() {

        System.out.println("i am a man ,and i can speek");
    }
}
