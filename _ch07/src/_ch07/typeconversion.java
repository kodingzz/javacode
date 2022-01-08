package _ch07;

public class typeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=null;
		FireEngine fe= new FireEngine();   // FireEngine 인스턴스 생성
		FireEngine fe2= null;      
		fe.water();
		car =fe;   // 자손->조상. 5개의 멤버를 4개로 줄이는것은 안전하다. 
		// car.water();  error!  Car의 참조벼녀수로는 water() 호출 불가  
		fe2= (FireEngine)car;     // 조상->자손. 4개의 멤버를 5개의 멤버로 늘리는 것은 위험하기때문에 타입을 괄호안에 써줘야한다.  
		fe2.water();
		
		// 실제 인스턴스가 무엇인지 아는것이 중요하다.
		Car c= new Car();
		FireEngine ff= (FireEngine)c;
		// ff.water();  / error가 생기는 이유는 ff가 가리키는 객체는 Car이므로 water() 멤버가 존재하지 않는다.
		
	}
}



class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive");
	}
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
	
}