package _ch04;
import java.util.Scanner;
public class ex4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, sum=0;
		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		num=Integer.parseInt(str);
		
		while(num!=0) {
			sum+=num%10;
			System.out.printf("sum= %2d num=%d\n",sum,num);
			num=num/10;
		}
		System.out.printf("�� �ڸ����� ��:%d",sum);
	}
}

