package _ch07;

public class abstractmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Player p =new Player();   error!  �̿ϼ�Ŭ�����̹Ƿ�, ��������� �ϼ��ؾ��Ѵ�.
		audioplayer ap =new audioplayer();
		ap.play(100);
		Player app=new audioplayer();   // ������ 
		app.play(100);
	}
}

abstract class Player{             // �߻�Ŭ���� 
	abstract void play(int pos);  // �߻�ż���  : �����ΰ� ���� �޼���
	abstract void stop();
}

class audioplayer extends Player{
	void play(int pos) {
		System.out.println(pos+"��ġ���� play�մϴ�.");
	}
	void stop() {
		System.out.println("����� ����ϴ�.");
	}
	
}