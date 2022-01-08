package _ch07;

public class abstractmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Player p =new Player();   error!  미완성클래스이므로, 상속을통해 완성해야한다.
		audioplayer ap =new audioplayer();
		ap.play(100);
		Player app=new audioplayer();   // 다형성 
		app.play(100);
	}
}

abstract class Player{             // 추상클래스 
	abstract void play(int pos);  // 추상매서드  : 구현부가 없는 메서드
	abstract void stop();
}

class audioplayer extends Player{
	void play(int pos) {
		System.out.println(pos+"위치부터 play합니다.");
	}
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
	
}