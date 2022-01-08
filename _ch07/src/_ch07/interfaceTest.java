package _ch07;

public class interfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		a.method(new C());  //A가 c를 사용         I i= new C();

	}

}

class A{
	public void method(I i) {                    // 인터페이스 I를 구현한 놈들만 들어와라!
		i.method();              
	}
}

interface I{
	public void method();
}


class B implements I{
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I{
	public void method() {
		System.out.println("C클래스의 메서드");
	}                    // A가 B에서 C로 바꿀려면 A클래스를 직접 바꿔야 한다.  --> 이를 해결하기위해 인터페이스 사용
}

// A가 B에 직접 연결하지 않고 중간에 I라는 인터페이스를 거친다. B에서 C로 변경돼도 A는 바뀌지 않는다.