package day04;
/*
 * import java.util.*;
 * 
 * public class BankApp {
 * 
 * static Account toss = new Account(); ArrayList<Account> accList = new
 * ArrayList<Account>();;
 * 
 * public void showMenu() {
 * System.out.println("====================================================");
 * System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료");
 * System.out.println("====================================================");
 * System.out.print("선택 > "); }
 * 
 * 
 * public void makeAccount() {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("----------"); System.out.println("계좌 생성");
 * System.out.println("----------");
 * 
 * System.out.print("계좌 번호 : "); String accNum = sc.next();
 * 
 * System.out.print("계좌주 : "); String accOwner = sc.next();
 * 
 * System.out.print("초기 입금액 : "); int balance = sc.nextInt();
 * toss.setBalance(balance); System.out.println("결과 : 계좌가 생성되었습니다.");
 * 
 * 
 * accList.add(toss);
 * 
 * }
 * 
 * 
 * public void showAccount() { for(Account acc : accList) { acc.getInfo(); } }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in); BankApp toss = new BankApp();
 * 
 * 
 * 
 * while(true) { toss.showMenu();
 * 
 * int num = sc.nextInt();
 * 
 * switch(num) { case 1 : toss.makeAccount(); break;
 * 
 * case 2 : toss.showAccount(); break;
 * 
 * case 3 : break;
 * 
 * case 4 : break;
 * 
 * case 5 : System.exit(0); }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * toss.setBalance(10000); System.out.println("현재 잔고 : " + toss.getBalance());
 * 
 * toss.setBalance(-1000); System.out.println("현재 잔고 : " + toss.getBalance());
 * 
 * 
 * }
 * 
 * }
 */