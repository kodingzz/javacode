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
		this("SPADE",1);       // Card �⺻������
	}
	Card(String kind,int number){
		this.kind=kind;
		this.number=number;        // Card �Ű������ִ� ������
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card)) return false;  // ����ȯ���� �ݵ�� instanceof�� Ȯ��
		Card c= (Card)obj;  // �������� ����ȯ  
		return this.kind.equals(c.kind) && this.number==c.number;       // this.kind�� c.kind�� ���ڿ��̹Ƿ� equals()�� ��
	}
	
	public int hashCode() {
		return  Objects.hash(kind,number);       //equals()�������̵��ϸ� hashCode()�� �������̵� �ؾ��Ѵ�.  
	}
	
	public String toString() {
		return "kind:"+kind+", number:"+number;
	}
	
}
