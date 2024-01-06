package StudyEffectiveJava8.chapter2.item3.inflearn;

public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis() {}

    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance() {
        return (MetaElvis<T>) INSTANCE;
    }

    public void say(T t) {
        System.out.println(t);
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
        System.out.println(elvis1);
        System.out.println(elvis2);
        System.out.println(elvis1.equals(elvis2));  // Type이 다르기 때문에 ==으로 비교 불가능
    }
}
