package _ch07;

public class superConstuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point4D pp= new Point4D(1,2,3);
		System.out.println("x="+pp.x+"y="+pp.y+"z="+pp.z);
		
	}
}


class Point4{
	int x;
	int y;
	
	Point4() {}   // 기본 생성자는 클래스 만들때 만들어주는게 좋다. 
	Point4(int x, int y){
		this.x=x;
		this.y=y;
	}
}


class Point4D extends Point4{
	int z;
	Point4D(int x, int y, int z){
		super(1,2);   // 조상의 생성자 호출
//		this.x=x;
//		this.y=y;
		this.z=z;
		
	}
}