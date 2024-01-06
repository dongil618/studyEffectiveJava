package StudyEffectiveJava8.chapter2.item2;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class MemberLombokDto {
    private final int id;
    private final String email;
    private final String name;
    private final int age;
    private final String hobby;
    private final String address;
}
