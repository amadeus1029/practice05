package com.javaex.ex10;

public class Book {
    private int bookNo;
    private String title, author;
    private int stateCode;

    public Book(int bookNo, String title, String author) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.stateCode = 1;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStateCode() {
       if(this.stateCode == 0) {
           return "대여중";
       } else {
           return "재고있음";
       }
    }

    public void rent() {
        if(this.stateCode == 1) {
            this.stateCode = 0;
        } else {
            System.out.println("이미 대여중인 책입니다");
        }
    }

    public void print() {
        System.out.println(this.getBookNo()+" 제목:"+this.getTitle()+" 작가:"+this.getAuthor()+", 대여 유무:"+this.getStateCode());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNo=" + bookNo +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", stateCode=" + stateCode +
                '}';
    }
}
