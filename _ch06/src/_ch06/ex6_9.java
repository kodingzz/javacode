package _ch06;

public class ex6_9 {

	public static void main(String[] args) {      // ���ÿ� main�޼��尡 ���� ���δ�.
		// TODO Auto-generated method stub
		Mymath2 mm= new Mymath2();   // ��ü ����
		mm.a=100L;
		mm.b=200L;
		
		System.out.println(mm.add());      // ��ü ������ ȣ�� 
		System.out.println(mm.add(150L,200L));   // ��ü�� �����Ǿ��⶧���� staic�޼��嵵 �������� �̿밡�������� ����x
		System.out.println(Mymath2.add(150L, 200L));   // ��ü �������� ȣ��
		
	}
}



class Mymath2{
	long a,b;   // iv  
	
	long add() { return a+b;}         // iv ���
	
	static long add(long  a, long b){ return a+b;}    // lv ���
	
}