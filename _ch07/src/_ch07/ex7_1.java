package _ch07;

public class ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartTv tv = new smartTv();
		tv.channel=10;               // ����Ŭ�����κ��� ���
		tv.channelup();              // ����Ŭ�����κ��� ���
		System.out.println(tv.channel);
		tv.displaycaption("hello world");  // caption=false�̹Ƿ� ���x
		tv.caption=true;
		tv.displaycaption("hello world");  // caption=true�̹Ƿ� ��� 

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