package StudyEffectiveJava8.chapter2.item3.inflearn;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    public static final Elvis INSTANCE = new Elvis();
    private static boolean created;
    private Elvis() {
        if(created) {
            throw new UnsupportedOperationException("can't be created by contructor");
        }

        created = true;
    }
    public static Elvis getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();

        System.out.println(Elvis.getInstance());
        System.out.println(Elvis.getInstance());
    }

    @Override
    public void sing() {
        System.out.println("my way~~~");
    }

    // 아래 코드 추가시 ElvisSerialization가 true로 출력됨.
    private Object readResolve() {
        return INSTANCE;
    }
}
