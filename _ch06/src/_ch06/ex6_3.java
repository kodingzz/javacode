package _ch06;

public class ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1= new Card();
		c1.kind="Heart";
		c1.number=7;
		Card c2= new Card();
		c2.kind="Spade";
		c2.number=5;
		
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		System.out.println("c1�� "+c1.kind+", "+c1.number+"�̸�, ũ��� ("+Card.width+", "+Card.height+")");
		System.out.println("c2�� "+c2.kind+", "+c2.number+"�̸�, ũ��� ("+Card.width+", "+Card.height+")");
		System.out.println("c1�� width�� height�� ���� 50,80���� �����մϴ�.");
		Card.width=50;
		Card.height=80;     // width, height�� Ŭ���� �����̹Ƿ� �տ� Ŭ�����̸� ����.
		System.out.println("c1�� "+c1.kind+", "+c1.number+"�̸�, ũ��� ("+Card.width+", "+Card.height+")");
		System.out.println("c2�� "+c2.kind+", "+c2.number+"�̸�, ũ��� ("+Card.width+", "+Card.height+")");
		
	}
}



class Card{
	static int  width=100;
	static int height=250;   // Ŭ���� ����
	
	String kind;
	int number;   // �ν��Ͻ� ����
	
}