package _ch06;

public class ex6_10 {

	public static void main(String[] args) {      // 스택에 main메서드가 먼저 쌓인다.
		// TODO Auto-generated method stub
		Mymath3 mm= new Mymath3();  // 객체 생성  
		System.out.println("mm.add(3,3) 결과:" +mm.add(3,3));       // println 안의 문자열과 add메서드중 add메서드가 먼저 호출된다. 이후 문자열과 결과값이 출력
		System.out.println("mm.add(3L,3L) 결과:" +mm.add(3L,3L));
		int[] a= {100,200,300};
		System.out.println("mm.add(a) 결과:" +mm.add(a));
		
		
		
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