package _ch06;

public class ex6_12 {

	public static void main(String[] args) {      // 스택에 main메서드가 먼저 쌓인다.
		// TODO Auto-generated method stub
		Car c1= new Car();     // 기본 생성자 호출
		c1.color="red";
		c1.gearType="auto";
		c1.door=2;
		Car c2= new Car("blue","auto",4);   // 매개변수 있는 생성자 호출  , 간단한 표현
		
		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);  // c1, c2 가 가리키는 객체값 출력*- 
		
		
		
		
	}
}



class Car{
	String color;
	String gearType;
	int door;
	
	Car() {}     // 기본 생성자 생성
	Car(String c, String g, int d){
		color=c;
		gearType=g;
		door=d;        // 매개변수 생성자 생성
	}
}