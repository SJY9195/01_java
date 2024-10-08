package main.java.com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Set 인터페이스를 구현한 Set 컬렉션 클래스
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다.
        *
        * - 장점 : 고유성 보장, 효율적인 데이터 테스트, 수학적 집합 연산 가능
        *         list에서 중복 제거 가능
        *
        * HashSet
        * set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
        *
        * */

        HashSet<String> hset = new HashSet<String>();

        hset.add(new String("java"));
        hset.add(new String("jdbc"));
        hset.add(new String("mysql"));
        hset.add(new String("css"));
        hset.add("java");   // 이렇게 추가해도 중복 저장 허용하지 않으므로 리스트에 추가되지 않는다!

        System.out.println(hset);

        System.out.println(hset.size());

        System.out.println(hset.contains("java"));
        System.out.println(hset.contains(new String("java")));  // 동등객체는 같은 해쉬코드로 볼수 있게 오버라이드 되어있다!!

        // 1. toArray() 이용해 배열로 바꿈
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }


        // 2. iterator() 로 목록을 만든다.
        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()){  ///Tokenizer와 같다!
            System.out.println(iter.next());
        }

        System.out.println(iter.hasNext());

        System.out.println(hset);   // 새롭게 set을 만드는게 아니라 원본 set을 가지고 변경해준다.

        hset.clear();
        System.out.println(hset.isEmpty());

    }
}
