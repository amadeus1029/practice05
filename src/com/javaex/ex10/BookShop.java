package com.javaex.ex10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        Book[] books = new Book[10];

        books[0] = new Book(1, "트와일라잇", "스테파니메이어");
        books[1] = new Book(2, "뉴문", "스테파니메이어");
        books[2] = new Book(3, "이클립스", "스테파니메이어");
        books[3] = new Book(4, "브레이킹던", "스테파니메이어");
        books[4] = new Book(5, "아리랑", "조정래");
        books[5] = new Book(6, "젊은그들", "김동인");
        books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
        books[7] = new Book(8, "귀천", "천상병");
        books[8] = new Book(9, "태백산맥", "조정래");
        books[9] = new Book(10, "풀하우스", "원수연");

        System.out.println("-------------------------------");
        System.out.println("  도서 대여시스템에 오신것을 환영합니다   ");
        System.out.println("-------------------------------");

        do {
            try {

                System.out.println("원하시는 메뉴를 선택해주세요");
                System.out.println("1. 대여\t2. 목록\t3. 종료");
                System.out.print(">> ");
                int menuNo = scanner.nextInt();
                switch (menuNo) {
                    case 1:
                        do {
                            try {
                                System.out.print("대여 하고 싶은 책의 번호를 입력하세요: ");
                                int num = scanner.nextInt();
                                if(num>0&&num<books.length) {
                                    if(books[num-1].getStateCode() == "재고있음") {
                                        books[num-1].rent();
                                    } else {
                                        System.out.println("재고가 없는 책입니다");
                                    }
                                    break;
                                } else {
                                    System.out.println("존재하지 않는 책입니다");
                                }
                            } catch(InputMismatchException ime) {
                                System.out.println("번호를 잘못 입력하셨습니다");
                                scanner = new Scanner(System.in);
                            }
                        } while(true);

                        break;
                    case 2:
                        System.out.println("*****도서 정보 출력하기******");
                        displayBookInfo(books);

                        break;
                    case 3:
                        System.out.println("프로그램 종료");
                        end = true;

                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
                }


            } catch (InputMismatchException ime) {
                System.out.println("잘못 입력하셨습니다, 다시 입력해주세요");
                scanner = new Scanner(System.in);
            }
        } while (!end);

        scanner.close();
    }

    //(2)전달받은 배열을 모두 출력하는 메소드
    private static void displayBookInfo(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            books[i].print();
        }
    }
}
