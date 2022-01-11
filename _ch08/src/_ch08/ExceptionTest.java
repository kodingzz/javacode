package _ch08;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		}
		catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("ture");
			System.out.println("ArithmeticException");
			
		}
		catch(Exception e) {
			System.out.println("Exception");             // 모든 예외 의 최고조상이므로 모든 예외 처리가능하다.  
		}
		System.out.println(6);
	}

}
