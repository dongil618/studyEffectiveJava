package StudyEffectiveJava8.chapter2.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {              // Pizza가 공변 반환 타이핑이 아닐 경우 T가 아니라 Builder<T>
            toppings.add(Objects.requireNonNull(topping));
            return self();                                  // Pizza가 공변 반환 타이핑이 아닐 경우 return self(); 대신 return this;   => 타입 캐스팅이 필요하게 됨
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
