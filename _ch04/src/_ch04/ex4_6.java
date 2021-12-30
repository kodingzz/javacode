package _ch04;
import java.util.Scanner;
public class ex4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("현재 월을 입력하세요.>");
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();         // 화면을 통해 입력받은 값을 month에 저장
		
		switch(month) {
			case 3:case 4:case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;                                  // break문이 있어야 switch문이 종료된다. 
				
			case 6:case 7:case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
				
			case 9:case 10:case 11:
				System.out.println("현재 계절은 가을입니다.");	
				break;
			default:                                       // break가 없으면 switch문은 default의 내용까지 지난후 종료된다.
				System.out.println("현재 계절은 겨울입니다.");
	}
	}
		
}
