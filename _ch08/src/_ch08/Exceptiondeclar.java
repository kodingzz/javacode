package _ch08;

public class Exceptiondeclar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method1();                           // ���� �߻�   try-catch�����Ƿ� ���� JVM�� ���ѱ�鼭 ����������  
	}
	static void method1() throws Exception{  // ���� �߻�   try-catch�����Ƿ� �����ϸ鼭 main�� ���ѱ�
		method2();
	}
	static void method2() throws Exception{
		throw new Exception();          // ���� �߻�   try-catch�����Ƿ� �����ϸ鼭 method1�� ���ѱ�
	}
}
