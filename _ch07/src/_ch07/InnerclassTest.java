package _ch07;

public class InnerclassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}

class AA{  // 외부클래스
	int i=100;
	BB b= new BB();
	class BB{ // 내부클래스
		void method() {
//			AA a= new AA();
//			System.out.println(a.i);
			System.out.println(i);  // 객체 생성없이 외부 클래스에 접근 가능
		}
	}
}


