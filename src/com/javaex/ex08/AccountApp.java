
package com.javaex.ex08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money;
        
        Account account = new Account("312-89562-123456");
        System.out.println(account.getAccountNo()+" 계좌가 개설되었습니다.");

            while(run){
                try {
                    System.out.println("");
                    System.out.println("----------------------------------");
                    System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
                    System.out.println("----------------------------------");
                    System.out.print("선택>");

                    int menuNo = sc.nextInt();

                    switch(menuNo){

                        case 1:
                            do {
                                try {
                                    System.out.print("예금액>");
                                    money = sc.nextInt();
                                    if(money < 0 ) {
                                        System.out.println("올바른 금액을 입력해주세요");
                                        continue;
                                    } else {
                                        account.deposit(money);
                                        break;
                                    }
                                } catch(InputMismatchException ime) {
                                    System.out.println("예금액을 잘못 입력하셨습니다");
                                    sc = new Scanner(System.in);
                                }
                            }while(true);

                            break;

                        case 2:
                            do {
                                try {
                                    System.out.print("출금액>");
                                    money= sc.nextInt();
                                    if(money < 0 ) {
                                        System.out.println("올바른 금액을 입력해주세요");
                                        continue;
                                    } else {
                                        account.withdraw(money);
                                        break;
                                    }
                                } catch(InputMismatchException ime) {
                                    System.out.println("출금액을 잘못 입력하셨습니다");
                                    sc = new Scanner(System.in);
                                }
                            }while(true);

                            break;

                        case 3:
                            System.out.print("잔고액>");
                            account.showBalance();
                            break;

                        case 4:
                            System.out.print("프로그램 종료");
                            run = false;
                            break;

                        default :
                            System.out.println("메뉴번호를 다시 입력해주세요");
                            break;

                    }//switch
                }catch(InputMismatchException ime) {
                    System.out.println("메뉴번호를 다시 입력해주세요");
                    sc = new Scanner(System.in);
                }
            }//while


        sc.close();
    }

}

