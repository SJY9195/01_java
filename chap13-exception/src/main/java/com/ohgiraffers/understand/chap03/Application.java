package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static ArrayList<Product> productList = new ArrayList<>();
    private static ArrayList<Customer> customerList = new ArrayList<>();

    public static void main(String[] args) {
            initializeProducts();
            Scanner scr = new Scanner(System.in);

            while (true){




            }

    }

    private static void initializeProducts() {    //제품 목록 메소드

            productList.add(new Product("에어컨", 150000,5));

    }
}
