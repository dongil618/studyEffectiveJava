package StudyEffectiveJava8.chapter2.item3.inflearn;

import java.util.function.Supplier;

public class Concert {

    private boolean lightsOn;

    private boolean mainStateOpen;

    private IElvis elvis;

    public Concert(IElvis elvis) {
        this.elvis = elvis;
    }

    public Concert() {}

    public void perform() {
        mainStateOpen = true;
        lightsOn = true;
        elvis.sing();
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public boolean isMainStateOpen() {
        return mainStateOpen;
    }

    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sing();
    }

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.start(Elvis::getInstance);
    }
}
