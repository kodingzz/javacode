package _ch06;

public class ex6_10 {

	public static void main(String[] args) {      // ���ÿ� main�޼��尡 ���� ���δ�.
		// TODO Auto-generated method stub
		Mymath3 mm= new Mymath3();  // ��ü ����  
		System.out.println("mm.add(3,3) ���:" +mm.add(3,3));       // println ���� ���ڿ��� add�޼����� add�޼��尡 ���� ȣ��ȴ�. ���� ���ڿ��� ������� ���
		System.out.println("mm.add(3L,3L) ���:" +mm.add(3L,3L));
		int[] a= {100,200,300};
		System.out.println("mm.add(a) ���:" +mm.add(a));
		
		
		
	}
}

class Mymath3{
	int add(int a, int b){
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result=0;
		for(int i=0;i<a.length;i++)
			result+=a[i];
		return result;
	}
	
}