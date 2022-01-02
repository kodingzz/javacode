package _ch06;

public class ex6_8 {

	public static void main(String[] args) {      // 스택에 main메서드가 먼저 쌓인다.
		// TODO Auto-generated method stub
		Data2 d= new Data2();   // 객체 생성
		d.x=10;
		System.out.println("main() : x = "+d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x);
		
	}
	static void change(Data2 d) {
			d.x = 100;
			System.out.println("change() : x = "+d.x);
		}
		
		
	}


class Data2 { int x;}