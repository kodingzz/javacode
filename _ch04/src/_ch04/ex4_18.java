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
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");
			String str= scanner.nextLine();
			menu=Integer.parseInt(str);
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;             // while���� ������.
			}
			else if(menu>3||menu<1) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;                // �ٽ� while���� ������ �ö󰣴�.
			}
			System.out.println("�����Ͻ� �޴��� "+menu+"���Դϴ�.");
		}
	}
}