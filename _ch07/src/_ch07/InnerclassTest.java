package _ch07;

public class InnerclassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}

class AA{  // �ܺ�Ŭ����
	int i=100;
	BB b= new BB();
	class BB{ // ����Ŭ����
		void method() {
//			AA a= new AA();
//			System.out.println(a.i);
			System.out.println(i);  // ��ü �������� �ܺ� Ŭ������ ���� ����
		}
	}
}


