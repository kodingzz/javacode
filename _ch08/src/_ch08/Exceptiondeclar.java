package _ch08;

public class Exceptiondeclar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method1();                           // 예외 발생   try-catch없으므로 예외 JVM에 떠넘기면서 비정상종료  
	}
	static void method1() throws Exception{  // 예외 발생   try-catch없으므로 종료하면서 main에 떠넘김
		method2();
	}
	static void method2() throws Exception{
		throw new Exception();          // 예외 발생   try-catch없으므로 종료하면서 method1에 떠넘김
	}
}
