package _ch06;

public class ex6_9 {

	public static void main(String[] args) {      // 스택에 main메서드가 먼저 쌓인다.
		// TODO Auto-generated method stub
		Mymath2 mm= new Mymath2();   // 객체 생성
		mm.a=100L;
		mm.b=200L;
		
		System.out.println(mm.add());      // 객체 생성후 호출 
		System.out.println(mm.add(150L,200L));   // 객체가 생성되었기때문에 staic메서드도 참조변수 이용가능하지만 권장x
		System.out.println(Mymath2.add(150L, 200L));   // 객체 생성없이 호출
		
	}
}



class Mymath2{
	long a,b;   // iv  
	
	long add() { return a+b;}         // iv 사용
	
	static long add(long  a, long b){ return a+b;}    // lv 사용
	
}