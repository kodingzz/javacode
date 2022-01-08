package _ch07;

public class abstractmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		// Unit[] group = new Unit[3];
		// group[0]= new Marine();
		// group[1]= new Tank();
		// group[2]= new Dropship();
		group[0].move(100,200);    // marine��ü�� move(100,200) ȣ��
		group[1].move(100,200);    // tank��ü�� move(100,200) ȣ��
		group[2].move(100,200);   // dropship��ü�� move(100,200) ȣ��
	}
	
}


abstract class Unit{                 //����κ��� �θ� �߻�Ŭ������ ������.
	int x,y;
	abstract void move(int x, int y);
	void stop() {/* ����ġ���� ���� */}
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
