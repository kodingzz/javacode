package _ch06;

public class ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1= new Tv();
		Tv t2= new Tv();
		System.out.println("t1�� channel���� "+t1.channel+" �Դϴ�.");
		System.out.println("t2�� channel���� "+t2.channel+" �Դϴ�.");  // channel�� ������ �⺻�� 0(int)
		
		t1.channel=8;   // channel�� 8�� �Ѵ�.
		System.out.println("t1�� channel���� "+t1.channel+" �Դϴ�.");
		System.out.println("t2�� channel���� "+t2.channel+" �Դϴ�.");   // t1,t2�� ���� �ٸ� ��ü�ּҸ� �޾Ҵ�.
		
		
		t2=t1;   // t2�� t1�� ����Ű�� ��ü�� �����
		System.out.println("t2�� channel���� "+t2.channel+" �Դϴ�.");
	}
}
