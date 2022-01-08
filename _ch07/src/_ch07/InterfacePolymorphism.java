package _ch07;

public class InterfacePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f= new Fighter();    // Fightable f =new Fighter(); Fightable�����ܿ��� move,attack��ư �ֱ⶧���� ����
		f.move(100,200);
		f.attack(new Fighter());    //Fighter f2= new Fighter();  f.attack(f2);

	}

}

abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() { System.out.println("����ϴ�.");}

}

interface Fightable{
	void move(int x, int y);            // public abstract ����
	void attack(Fightable f);           // public abstract ����
}

class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) {              // �������̵� ��Ģ: ���󺸴� ���������ڰ� ������ �ȵȴ�. ����(public) ���� public�� �ٿ�����.  
		System.out.println("["+x+","+y+"]�� �̵�");            
	}
	public void attack(Fightable f)
	{
		System.out.println(f+"�� ����");
	}
	
}