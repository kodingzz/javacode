package _ch06;

public class ex6_13 {

	public static void main(String[] args) {      // 스택에 main메서드가 먼저 쌓인다.
		// TODO Auto-generated method stub
		Car2 c1= new Car2();
		Car2 c2= new Car2("blue","auto",4);
		Car2 c3= new Car2("brown");
		
		System.out.println("c1의 color="+c1.color+", gearType="+c1.geartype+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.geartype+", door="+c2.door);  
		System.out.println("c3의 color="+c3.color+", gearType="+c3.geartype+", door="+c3.door); 
	}
}

class Car2{
	String color;
	String geartype;
	int door;
	
	Car2() {
		this("white","auto",4);       // 다른 생성자 호출 
	}
	
	Car2(String c, String g, int d){
		color=c;
		geartype=g;
		door=d;
	}
	Car2(String cc){
		this(cc,"auto",4);    // 다른 생성자 호출
	}
	
	
}