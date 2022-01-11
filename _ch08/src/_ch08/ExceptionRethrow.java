package _ch08;

public class ExceptionRethrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stutb
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리되었숩니다.");
		}

	}
	static void method1() throws Exception{
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e;
		}
	}
	

}
