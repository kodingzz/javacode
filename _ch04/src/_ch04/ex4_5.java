package _ch04;
import java.util.Scanner;
public class ex4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		char grade =' ', opt='0';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner=new Scanner(System.in);
		score= scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.\n",score);
		if(score>=90) {
			grade='A';
			if(score>=98)
				opt='+';               // 90점 이상중에 98보다 크면 A+ 아니면 A0
		}
		else if(score>=80) {
			grade='B';
			if(score>=88)
				opt='+';                 // 80점 이상중에 88보다 크면 B+ 아니면 B0
		}
		else 
			grade='C';          // C0
			
		
		System.out.printf("당신의 학점은 %c%c입니다.",grade,opt);
	}

}
