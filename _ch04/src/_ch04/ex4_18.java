package _ch04;
import java.util.Scanner;
public class ex4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=0;
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) sqaure");
			System.out.println("(2) sqaure root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
			String str= scanner.nextLine();
			menu=Integer.parseInt(str);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;             // while문을 나간다.
			}
			else if(menu>3||menu<1) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;                // 다시 while문의 맨위로 올라간다.
			}
			System.out.println("선택하신 메뉴는 "+menu+"번입니다.");
		}
	}
}