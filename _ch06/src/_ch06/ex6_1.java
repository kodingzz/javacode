package _ch06;

public class ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;     // Tv 객체 참조하기위한 변수 t 선언
		t=new Tv();  // Tv 객체 생성
		t.channel=7;  
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+" 입니다.");
		

	}

}

class Tv{         // Tv class 
	String color;
	boolean power;
	int channel;  // Tv 변수
	
	void power()   {power = !power;}
	void channelUp()  {++channel;}
	void channelDown()  {--channel;}   // Tv 메서드
	
}
