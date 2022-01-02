package _ch06;

public class ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath m=new MyMath();   // 객체 생성
		
		long result1=m.add(10L,1L);
		long result2=m.sub(10L,1L);                    
		long result3=m.mult(10L,1L);
		double result4=m.div(10,1);
		long result5=m.max(10L,1L);  // ------> 메서드 호출
		
		System.out.println("add(10L,1L) = "+ result1);
		System.out.println("syb(10L,1L) = "+ result2);
		System.out.println("mult(10L,1L) = "+ result3);
		System.out.println("div(10,1) = "+ result4);
		System.out.println("max(10,1) = "+ result5);
		
	}
}


class MyMath{
	long add(long a, long b) {                               //---------> 메서드 선언 
		long result = a+b;
		return result;
	}
	long sub(long a, long b) {return a-b;}   // 간단하게 정리 가능
	long mult(long a, long b) { return a*b;}
	double div(double a, double b) {return a/b;}  
	
	long max(long a, long b) {
		long result=0;
		if(a>b)
			result=a;
		else
			result=b;      
		return result;     // 삼항 연산자 result= a>b?:a:b;
	}
}