package _ch06;

public class ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1= new Tv();
		Tv t2= new Tv();
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");  // channel값 지정전 기본값 0(int)
		
		t1.channel=8;   // channel값 8로 한다.
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");   // t1,t2는 서로 다른 객체주소를 받았다.
		
		
		t2=t1;   // t2는 t1이 가리키는 객체와 연결됨
		System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");
	}
}
