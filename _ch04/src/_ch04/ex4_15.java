package _ch04;
import java.util.Scanner;
public class ex4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =0, answer=0;
		answer=(int)(Math.random()*100)+1;  // ����(���� ������� ��)
		
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			input=scanner.nextInt();        // �Է°�

			if(input>answer)
				System.out.println("�� ���� ������ �ٽ� �õ��غ�����.");
			else if(input<answer)
				System.out.println("�� ū ������ �ٽ� �õ��غ�����.");

		}while(input!=answer);  // �Է°��� ������ ������ ����ó��
		
		System.out.println("�����Դϴ�.");
		
	
		
	}
}