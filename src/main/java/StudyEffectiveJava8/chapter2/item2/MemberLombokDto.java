package StudyEffectiveJava8.chapter2.item2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder(builderMethodName = "innerBuilder") // 출처: https://hothoony.tistory.com/1295 [develog:티스토리]
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE) // @Builder 사용시 모든 필드 값을 파라미터로 받는 생성자가 자동으로 만들어지는데 사용하지 않는다면 private로 설정
public class MemberLombokDto {
    private final int id;       // 필수
    private final String email; // 필수
    private final String name;
    private final int age;
    private final String hobby;
    private final String address;

    // builder 메소드를 재정의해서 필수 필드를 입력받도록 변경
    public static MemberLombokDtoBuilder builder(int id, String email) {
        return innerBuilder()
                .id(id)
                .name(email)
                .name("")
                .age(0)
                .hobby("")
                .address("");
    }

    // 기존과 같이 아무 값이 MemberLombokDtoBuilder를 만들 때 필요
    public static MemberLombokDtoBuilder builder() {
        return innerBuilder();
    }
}
