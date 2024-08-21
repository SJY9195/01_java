package main.java.com.ohgiraffers.section03.uses;

public enum UserRole2 {

    GUEST("게스트"),

    CONSUMER("구매자"),

    PRODUCER("판매자"),

    ADMIN("관리자");

    private final String description;

    UserRole2(String description) {     // 자동으로 상수의 속성(소괄호안의값)이 description으로 들어온다!
        this.description = description;    // 즉, 인스턴스를 만들면 상수의 속성이 따라온다!
    }

    public String getDescription() {
        return description;
    }
}
