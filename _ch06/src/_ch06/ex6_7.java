package _ch06;

public class ex6_7 {

	public static void main(String[] args) {      // ���ÿ� main�޼��尡 ���� ���δ�.
		// TODO Auto-generated method stub
		Data3 d= new Data3();   // ��ü ����          
		d.x=10;               // �������� d�� ����Ű�� ��ü�� x��=10
		
		Data3 d2= copy(d);           // �������� d2 �����ǰ� copy �޼���ȣ�� 
		System.out.println("d.x ="+d.x);    
		System.out.println("d2.x ="+d2.x);
		
		
	}
	static Data3 copy(Data3 d) {      
		Data3 tmp =new Data3();
		tmp.x=d.x;
		return tmp;              // tmp�� ���������� ��ü�� �����ǹǷ� d2�� ��ü�� �޴´�.
	}
		
		
	}


class Data3 { int x;}