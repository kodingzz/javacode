package _ch03;

public class ex3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10_000_000;
		int b=20_000_000;
		
//		long c=a*b;    // 오버플로우 발생!!  a*b는 int형이므로 20억이 넘으면 오버플로우가 발생한다.
		long c=(long)a*b;   
		System.out.println(c);
		
	}

}
