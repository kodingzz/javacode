package _ch06;

public class ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;     // Tv ��ü �����ϱ����� ���� t ����
		t=new Tv();  // Tv ��ü ����
		t.channel=7;  
		t.channelDown();
		System.out.println("���� ä���� "+t.channel+" �Դϴ�.");
		

	}

}

class Tv{         // Tv class 
	String color;
	boolean power;
	int channel;  // Tv ����
	
	void power()   {power = !power;}
	void channelUp()  {++channel;}
	void channelDown()  {--channel;}   // Tv �޼���
	
}
