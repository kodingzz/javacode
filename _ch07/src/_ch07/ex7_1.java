package _ch07;

public class ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartTv tv = new smartTv();
		tv.channel=10;               // 조상클래스로부터 상속
		tv.channelup();              // 조상클ㄹ스로부터 상속
		System.out.println(tv.channel);
		tv.displaycaption("hello world");  // caption=false이므로 출력x
		tv.caption=true;
		tv.displaycaption("hello world");  // caption=true이므로 출력 

	}

}

class Tv{
	boolean power;
	int channel;
	void power() {power=!power;}
	void channelup() {++channel;}
	void channeldown() {--channel;}	
	
}

class smartTv extends Tv{
	boolean caption;
	void displaycaption(String text) {
		if(caption)
			System.out.println(text);
	}
	
}