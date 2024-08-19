package main.java.com.ohgiraffers.section01.list.comparator;

import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {


    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        int result = 0;

        if(o1.getPrice() > o2.getPrice()) {
            return 1;                            // 양수가 자리 바꾸는것
        }else if (o1.getPrice() < o2.getPrice()) {
            result = -1;                         // 음수가 자리 안바꾸는것
        }else{
            result = 0;
        }
        return result;
    }

}
