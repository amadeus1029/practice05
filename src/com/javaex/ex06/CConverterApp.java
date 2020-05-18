package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        System.out.println("100만원을 달러로 바꾸면");
        System.out.println(CConverter.toDoller(1000000)+"달러 입니다.");


        //100달려를 원으로 출력하기
        System.out.println("100달러를 원화로 바꾸면");
        System.out.println(CConverter.toKWR(100)+"원 입니다.");

        
        
    }

}
