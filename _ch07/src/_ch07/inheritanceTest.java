package _ch07;

public class inheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c= new circle();
		c.x=10;
		c.y=5;
		c.r=5;
		System.out.println("c.x= "+c.x+" c.y= "+c.y+" c.r= "+c.r);
		
		circle2 c2=new circle2();
		
		c2.p.x=2;
		c2.p.y=3;
		c2.r=10;
		System.out.println("c2 .p.x= "+c2.p.x+" c.p.y= "+c2.p.y+" c2.r= "+c2.r);
		
		System.out.println(c2.toString());
		System.out.println(c2);
		
		
		
	}
}

class mypoint{
	int x;
	int y;
}


class circle extends mypoint{           // 상속
	int r;
	
	
}

class circle2 extends Object {         // 포함
	mypoint p= new mypoint();           // 참조변수 p의 초기화
	int r;
	
}