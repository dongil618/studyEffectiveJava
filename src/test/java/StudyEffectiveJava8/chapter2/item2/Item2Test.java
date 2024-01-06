package StudyEffectiveJava8.chapter2.item2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class Item2Test {

    @Test
    @DisplayName("Builder 직접 만들었을 때 vs @Builder 롬복 사용했을 때 비교")
    public void test1() {
        MemberDto memberDto = new MemberDto.Builder()
                .id(1)
                .email("kdi618@cowave.kr")
                .name("name")
                .age(28)
                .build();

        MemberDto memberDtoWithoutNew = MemberDto.builder()
                .id(1)
                .email("kdi618@cowave.kr")
                .name("name")
                .age(28)
                .build();

        MemberLombokDto memberLombokDto = MemberLombokDto.builder()
                .id(1)
                .email("kdi618@cowave.kr")
                .name("name")
                .age(28)
                .build();

        log.info("memberDto={}", memberDto);
        log.info("memberDtoWithoutNew={}", memberDtoWithoutNew);
        log.info("memberLombokDto={}", memberLombokDto);
    }

    @Test
    @DisplayName("이펙티브 자바 - 피자 코드")
    public void pizzaCodeTest() {
        NewYorkPizza newYorkPizza = new NewYorkPizza.Builder(NewYorkPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();

        log.info("newYorkPizza={}", newYorkPizza.toString());
        log.info("newYorkPizza Toppings={}", newYorkPizza.toppings);

        log.info("calzone={}", calzone.toString());
        log.info("calzone={} Toppings", calzone.toppings);
    }
}
