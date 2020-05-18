package com.javaex.ex03;

public class SongApp {

    public static void main(String[] args) {

        Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2020", 3);


        //파라미터가 6개인 경우 파라미터5개 메소드를 호출하므로 메시지가 중복해서 나타날 것으로 예상
		/*
		결과값
		Song(파라미터5개)
        Song(파라미터6개)
		 */
    }

}


