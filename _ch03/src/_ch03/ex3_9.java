package _ch03;

public class ex3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10_000_000;
		int b=20_000_000;
		
//		long c=a*b;    // �����÷ο� �߻�!!  a*b�� int���̹Ƿ� 20���� ������ �����÷ο찡 �߻��Ѵ�.
		long c=(long)a*b;   
		System.out.println(c);
		
	}

}
