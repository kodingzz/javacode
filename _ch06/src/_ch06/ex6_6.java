package _ch06;

public class ex6_6 {

	public static void main(String[] args) {      // ���ÿ� main�޼��尡 ���� ���δ�.
		// TODO Auto-generated method stub
		Data d= new Data();   // ��ü ����
		d.x=10;
		System.out.println("main() : x = "+d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x);
		
	}
	static void change(int x) {
			x = 100;
			System.out.println("change() : x = "+x);
		}
		
		
	}


class Data { int x;}