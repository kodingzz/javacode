package _ch06;

public class ex6_7 {

	public static void main(String[] args) {      // 스택에 main메서드가 먼저 쌓인다.
		// TODO Auto-generated method stub
		Data3 d= new Data3();   // 객체 생성          
		d.x=10;               // 참조변수 d가 가리키는 객체의 x값=10
		
		Data3 d2= copy(d);           // 참조변수 d2 생성되고 copy 메서드호출 
		System.out.println("d.x ="+d.x);    
		System.out.println("d2.x ="+d2.x);
		
		
	}
	static Data3 copy(Data3 d) {      
		Data3 tmp =new Data3();
		tmp.x=d.x;
		return tmp;              // tmp는 없어지지만 객체는 유지되므로 d2가 객체를 받는다.
	}
		
		
	}


class Data3 { int x;}