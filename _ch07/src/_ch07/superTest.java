package _ch07;

public class superTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.method();
		
	}
}

class Parent{ int x=10;}   //super.x

class Child extends Parent{
	int x=20;
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);       // 자식 클래스 x
		System.out.println("super.x="+super.x);   // 부모클래스 x1
		
	}
}
