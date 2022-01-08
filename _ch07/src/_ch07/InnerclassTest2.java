package _ch07;

public class InnerclassTest2 {
	
	class Instanceinner{
		int iv=100;
		//static int cv=100;  error! static 변수 선언 할수없다.
		final static int CONST=100;
	}
	static class Staticinner{
		int iv=200;
		static int cv=200;
	}
	void mymethod() {
		class Localinner{
			int iv=300;
		//	static int cv=300;    error! static 변수 선언 할수없다.
			final static int CONST=300;
		}
		int i= Localinner.CONST;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Instanceinner.CONST);
		System.out.println(Staticinner.cv);
//		System.out.println(Localinner.CONST);  // 에러 지역내부클래스는 메서드내에 내에세만 사용가능
	}
	
	
}




