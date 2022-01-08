package _ch07;
import static java.lang.System.out;
import static java.lang.Math.*;          // static import문 : 클래스 이름 생략가능. Math클래스의 모든 static 멤버 생략가능




public class staticimport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println(random());   // System, Math 생략
		out.println("Math.PI :"+PI); 
	}
}