package _ch04;
import java.util.Scanner;
public class ex4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=0,num=0;
		Scanner scanner=new Scanner(System.in);
		outer:
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
			while(true) {
				System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체종료:99)>");
				str=scanner.nextLine();
				num=Integer.parseInt(str);
				
				if(num==0)
					break;
				if(num==99)
					break outer;
				
				switch(menu) {
				case 1:
					System.out.println("result="+num*num);
					break;
				case 2:
					System.out.println("result="+Math.sqrt(num));
					break;
				case 3:
					System.out.println("result="+Math.log(num));
					break;
				}
				
			}
		}
	}
}