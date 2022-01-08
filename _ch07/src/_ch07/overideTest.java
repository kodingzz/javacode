package _ch07;

public class overideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3 p=new Point3();
		p.x=3;
		p.y=5;
		p.z=7;
		System.out.println(p.getlocation());
		
	}
}

class Point{
	int x;
	int y;
	String getlocation() {
		return "x:"+x+" y:"+y;
	}
	
}

class Point3 extends Point{
	int z;
	String getlocation() {
		return "x:"+x+" y:"+y+" z:"+z;                    // 조상의 getLocation을 오버라이딩!
	
	}
}