package _ch06;

public class ex6_12 {

	public static void main(String[] args) {      // ���ÿ� main�޼��尡 ���� ���δ�.
		// TODO Auto-generated method stub
		Car c1= new Car();     // �⺻ ������ ȣ��
		c1.color="red";
		c1.gearType="auto";
		c1.door=2;
		Car c2= new Car("blue","auto",4);   // �Ű����� �ִ� ������ ȣ��  , ������ ǥ��
		
		System.out.println("c1�� color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2�� color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);  // c1, c2 �� ����Ű�� ��ü�� ���*- 
		
		
		
		
	}
}



class Car{
	String color;
	String gearType;
	int door;
	
	Car() {}     // �⺻ ������ ����
	Car(String c, String g, int d){
		color=c;
		gearType=g;
		door=d;        // �Ű����� ������ ����
	}
}