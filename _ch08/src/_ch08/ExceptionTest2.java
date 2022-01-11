package _ch08;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {	
			throw new Exception();         // Exception과 그 자손은 반드시 예외처리를 해줘야한다.
			
		}
		catch(Exception e) {
			
		}
	} // RuntimeException과 그 자손은 예외처리 해주지않아도 컴파일은 된다.
}

