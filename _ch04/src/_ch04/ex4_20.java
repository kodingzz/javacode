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
			while(true) {
				System.out.print("����� ���� �Է��ϼ���.(��� ����:0, ��ü����:99)>");
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