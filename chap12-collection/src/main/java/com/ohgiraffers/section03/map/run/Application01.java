package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Map
        * Collection 인터페이스와는 다른 저장 방식을 가진다.
        * 키와 값을 한 쌍으로 저장하는 방식을 사용한다.
        * 인덱스 대신에 키 사용
        *
        * 키(key)?
        * : 값을 찾기 위한 이름 역할을 하는 객체를 의미한다.
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복 값은 저장 가능하다.
        *
        * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있지만,
        * HashMap이 제일 많이 사용된다.
        *
        * */

        HashMap hmap = new HashMap();
        hmap.put("one", new Date());
        hmap.put(2, "redApple");   // 리터럴로 알고 있지만 자동으로 오토박싱이 된것이다! 그래서 기본자료형을 인스턴스로 만들어준다.
        hmap.put(3.3, 123);
        System.out.println(hmap);

        hmap.put(2, "yellow");    // 앞에가 key, 뒤에가 value이다!!!
        System.o





                //k ketSet90*//

        Collection<String> values = hmap2.values();

        Iterator<String> valueIter = values.iterator();
        while(valueIter.hasNext()){
            System.out.println(valueIter.next());
        }

        Object[] valueArr = values.toArray()));
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }

        // Map의 내부에 존재하는 EntrySet을 이용
        Set<Map.Entry<String, String>> set = hmap2.entrySet();

        Iterator<Map.Entry<String, String>> entryIter = set.iterator();

        while(entryIter.hasNext()){
            Map.Entry<String, String> entry = entryIter.next();


            System.out.println(entry.getKey() + " : " + entry.getValue());
        }










































    ap.put(3, "yellow");    //키 중복불가 밸류 중복가능
        System.out.println("키 3 에 대한값" + hmapget(3))[]

        // 키 값 삭제 처리 remove()
        hmap.remove(3);
        s

    }
}