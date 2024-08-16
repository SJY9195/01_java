package main.java.com.ohgiraffers.section02.uses;

public class MemberService { // application의 명령을 실행할 곳

    public void signUpMembers(){

        Member[] members = new Member[5];

        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "유관순", 16, '여');
        members[2] = new Member(3, "user03", "pass03", "이순신", 16, '여');
        members[3] = new Member(4, "user04", "pass04", "신사임당", 16, '여');
        members[4] = new Member(5, "user05", "pass05", "유관순", 16, '여');

        /* register 에 명령 */
        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);

    }

    public void showAllMembers(){

        MemberFinder memberFinder = new MemberFinder();

        System.out.println("----- 가입된 회원 목록 -----");

        for (Member member : memberFinder.findAllMembers()){
            if(member != null){
                System.out.println(member);
            }
        }
        System.out.println("회원 조회 완료 ------");
    }
}
