package _ch07;

public class InnerclassTest3 {
		private int outeriv=0;    // iv
		private static int outercv=0;  // cv;
		
		class InstanceInner{
			int iiv=outeriv;           // ����Ŭ�������� private�� ������ �����ϴ�.
			int iiv2= outercv;
		}
		static class StaticInner{
//			int siv=outeriv;  //  ����ƽ Ŭ������ �ܺ� �ν��Ͻ� ���(iv)�� ������ �� ����.
			static int scv=outercv;
	}
		void mymethod() {
			int lv=0;       // ����
			final int Lv=0; // �̼�
			class LocalInner{
				int liv=outeriv;
				int liv2=outercv;       // ����Ŭ�������� private ���� ����
				int liv3=lv;              // error! �������� Ŭ������ ���ΰ� �ִ� �޼����� ����� ��� �����ϴ�.
				int liv4=Lv;
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	}

}

