package _ch09;

import java.util.Objects;

public class toStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1= new Card();
		Card c2= new Card();
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

}
}
class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);       // Card 기본생성자
	}
	Card(String kind,int number){
		this.kind=kind;
		this.number=number;        // Card 매개변수있는 생성자
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card)) return false;  // 형변환전에 반드시 instanceof로 확인
		Card c= (Card)obj;  // 참조변수 형변환  
		return this.kind.equals(c.kind) && this.number==c.number;       // this.kind와 c.kind는 문자열이므로 equals()로 비교
	}
	
	public int hashCode() {
		return  Objects.hash(kind,number);       //equals()오버라이딩하면 hashCode()도 오버라이딩 해야한다.  
	}
	
	public String toString() {
		return "kind:"+kind+", number:"+number;
	}
	
}
