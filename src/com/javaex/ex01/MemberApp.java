package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member a = new Member("정우성","jws",50000);
		Member b = new Member("유재석","yjs",40000);
		Member c = new Member("이효리","lhr",30000);

		a.showInfo();
		b.showInfo();
		c.showInfo();
	}

}
