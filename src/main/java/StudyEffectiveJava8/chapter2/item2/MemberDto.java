package StudyEffectiveJava8.chapter2.item2;

import lombok.ToString;

@ToString
public class MemberDto {
    private final int id;
    private final String email;
    private final String name;
    private final int age;
    private final String hobby;
    private final String address;

    // 클라이언트 코드에서 빌더 패턴으로 객체 생성시 new를 제거할 수 있음.
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        // 필수 매개 변수
        private int id;
        private String email;

        // 선택 매개변수 - 기본값으로 초기화
        private String name = "";
        private int age = 0;
        private String hobby = "";
        private String address = "";

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder hobby(String val) {
            hobby = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public MemberDto build() {
            return new MemberDto(this);
        }
    }

    private MemberDto(Builder builder) {
        id = builder.id;
        email = builder.email;
        name = builder.name;
        age = builder.age;
        hobby = builder.hobby;
        address = builder.address;
    }
}
