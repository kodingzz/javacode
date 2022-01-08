package _ch07;

public class InnerclassTest3 {
		private int outeriv=0;    // iv
		private static int outercv=0;  // cv;
		
		class InstanceInner{
			int iiv=outeriv;           // 내부클래스에서 private에 접근이 가능하다.
			int iiv2= outercv;
		}
		static class StaticInner{
//			int siv=outeriv;  //  스태틱 클레스는 외부 인스턴스 멤버(iv)에 접근할 수 없다.
			static int scv=outercv;
	}
		void mymethod() {
			int lv=0;       // 변수
			final int Lv=0; // 싱수
			class LocalInner{
				int liv=outeriv;
				int liv2=outercv;       // 내부클래스에서 private 접근 가능
				int liv3=lv;              // error! 지역내부 클래스를 감싸고 있는 메서드의 상수만 사용 가능하다.
				int liv4=Lv;
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	}

}

