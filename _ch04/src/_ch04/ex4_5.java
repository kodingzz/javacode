package _ch04;
import java.util.Scanner;
public class ex4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		char grade =' ', opt='0';
		
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner=new Scanner(System.in);
		score= scanner.nextInt();
		
		System.out.printf("����� ������ %d�Դϴ�.\n",score);
		if(score>=90) {
			grade='A';
			if(score>=98)
				opt='+';               // 90�� �̻��߿� 98���� ũ�� A+ �ƴϸ� A0
		}
		else if(score>=80) {
			grade='B';
			if(score>=88)
				opt='+';                 // 80�� �̻��߿� 88���� ũ�� B+ �ƴϸ� B0
		}
		else 
			grade='C';          // C0
			
		
		System.out.printf("����� ������ %c%c�Դϴ�.",grade,opt);
	}

}
