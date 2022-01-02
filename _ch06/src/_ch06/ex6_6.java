package _ch06;

public class ex6_6 {

	public static void main(String[] args) {      // 스택에 main메서드가 먼저 쌓인다.
		// TODO Auto-generated method stub
		Data d= new Data();   // 객체 생성
		d.x=10;
		System.out.println("main() : x = "+d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x);
		
	}
	static void change(int x) {
			x = 100;
			System.out.println("change() : x = "+x);
		}
		
		
	}


class Data { int x;}