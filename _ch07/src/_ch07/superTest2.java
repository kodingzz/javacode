package _ch07;

public class superTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c=new Child2();
		c.method();
		
	}
}

class Parent2{ int x=10;}   //super.x

class Child2 extends Parent2{
	void method() {                                           
		System.out.println("x="+x);                //  �θ�Ŭ�������� ���� ����x�� method �޼������.
		System.out.println("this.x="+this.x);        
		System.out.println("super.x="+super.x);   
		
	}
}
