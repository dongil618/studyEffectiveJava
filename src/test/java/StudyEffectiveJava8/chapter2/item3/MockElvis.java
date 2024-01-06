package StudyEffectiveJava8.chapter2.item3;

import StudyEffectiveJava8.chapter2.item3.inflearn.IElvis;

public class MockElvis implements IElvis {

    @Override
    public void leaveTheBuilding() {

    }

    @Override
    public void sing() {
        System.out.println("You ain't nothin' but a hound dog.");
    }
}
