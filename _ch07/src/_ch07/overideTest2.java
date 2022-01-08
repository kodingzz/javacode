package _ch07;

public class overideTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypoint3 p =new Mypoint3(3,5);         // 인스턴스 생성 
//		p.x=3;
//		p.y=5;
		System.out.println(p.toString());
		System.out.println(p);
		
	}
}

class Mypoint3 extends Object{
	int x;
	int y;
	public String toString(){
		return "x:"+x+" y:"+y;
	}
	
	Mypoint3(int x, int y){
		this.x=x;
		this.y=y;
	}          //  매개변수 있는 생성자 생성
	
}

