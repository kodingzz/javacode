package _ch07;

public class InterfacePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f= new Fighter();    // Fightable f =new Fighter(); Fightable리모콘역시 move,attack버튼 있기때문에 가능
		f.move(100,200);
		f.attack(new Fighter());    //Fighter f2= new Fighter();  f.attack(f2);

	}

}

abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다.");}

}

interface Fightable{
	void move(int x, int y);            // public abstract 생략
	void attack(Fightable f);           // public abstract 생략
}

class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) {              // 오버라이딩 규칙: 조상보다 접근제어자가 좁으면 안된다. 조상(public) 따라서 public을 붙여야함.  
		System.out.println("["+x+","+y+"]로 이동");            
	}
	public void attack(Fightable f)
	{
		System.out.println(f+"를 공격");
	}
	
}