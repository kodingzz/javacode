package _ch07;

public class abstractmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		// Unit[] group = new Unit[3];
		// group[0]= new Marine();
		// group[1]= new Tank();
		// group[2]= new Dropship();
		group[0].move(100,200);    // marine객체의 move(100,200) 호출
		group[1].move(100,200);    // tank객체의 move(100,200) 호출
		group[2].move(100,200);   // dropship객체의 move(100,200) 호출
	}
	
}


abstract class Unit{                 //공통부분을 부모 추상클래스로 묶었다.
	int x,y;
	abstract void move(int x, int y);
	void stop() {/* 현위치에서 정지 */}
}
class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x="+x+",y="+y+"]");
	}
	void stimPack() {}
	
}
class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x="+x+",y="+y+"]");
	}
	void changemode() {}
	
}
class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x="+x+",y="+y+"]");
	}
	void load() {}
	void unload() {}
	
}
