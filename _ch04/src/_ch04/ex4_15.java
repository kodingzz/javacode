package _ch04;
import java.util.Scanner;
public class ex4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =0, answer=0;
		answer=(int)(Math.random()*100)+1;  // 정답(내가 맞춰야할 값)
		
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input=scanner.nextInt();        // 입력값

			if(input>answer)
				System.out.println("더 작은 값으로 다시 시도해보세요.");
			else if(input<answer)
				System.out.println("더 큰 값으로 다시 시도해보세요.");

		}while(input!=answer);  // 입력값과 정답이 같으면 정답처리
		
		System.out.println("정답입니다.");
		
	
		
	}
}