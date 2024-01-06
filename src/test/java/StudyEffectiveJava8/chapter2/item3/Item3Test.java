package StudyEffectiveJava8.chapter2.item3;

import StudyEffectiveJava8.chapter2.item3.inflearn.Concert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Item3Test {

    @Test
    void perform() {
        Concert concert = new Concert(new MockElvis());
        concert.perform();

        assertTrue(concert.isLightsOn());
        assertTrue(concert.isMainStateOpen());
    }
}
