package main.java.com.ohgiraffers.section03.uses;

public enum UserRole1 {

    GUEST,

    CONSUMER,

    PRODUCER,

    ADMIN;



    // Enum 은 상수 하나하나가 인스턴스화 된다.

    UserRole1(){
        System.out.println("기본생성자 호출됨");  // 상수의 개수 에따라 출력되는 개수가 달라진다.
    } // 생성자를 가질 순 있는데 못쓴다.   호출은 된다.

    // enum 타입은 고정된 상수들의 집합으로, 런타임 시가 아닌 컴파일 시에
    // 모든 값이 결정되어 있어야 한다.

    // 필요한 경우 메소드도 만들 수 있다.
    public String getNameToLowerCase(){
        return this.name().toLowerCase();    //여기서 name은 위의 상수들(GUEST, CONSUMER, PRODUCER, ADMIN) 이다.
    }
}
