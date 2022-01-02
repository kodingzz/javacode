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
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 ("+Card.width+", "+Card.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 ("+Card.width+", "+Card.height+")");
		System.out.println("c1의 width와 height을 각각 50,80으로 변경합니다.");
		Card.width=50;
		Card.height=80;     // width, height는 클래스 변수이므로 앞에 클래스이름 붙임.
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 ("+Card.width+", "+Card.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 ("+Card.width+", "+Card.height+")");
		
	}
}



class Card{
	static int  width=100;
	static int height=250;   // 클래스 변수
	
	String kind;
	int number;   // 인스턴스 변수
	
}