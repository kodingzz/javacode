package _ch07;

public class interfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		a.method(new C());  //A�� c�� ���         I i= new C();

	}

}

class A{
	public void method(I i) {                    // �������̽� I�� ������ ��鸸 ���Ͷ�!
		i.method();              
	}
}

interface I{
	public void method();
}


class B implements I{
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I{
	public void method() {
		System.out.println("CŬ������ �޼���");
	}                    // A�� B���� C�� �ٲܷ��� AŬ������ ���� �ٲ�� �Ѵ�.  --> �̸� �ذ��ϱ����� �������̽� ���
}

// A�� B�� ���� �������� �ʰ� �߰��� I��� �������̽��� ��ģ��. B���� C�� ����ŵ� A�� �ٲ��� �ʴ´�.