package _ch03;

public class ex3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.141592; 
	
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000);
		System.out.println(Math.round(pi*1000)/1000.0);

		// 3.141592���� 3.141������ ��Ÿ������? 
		System.out.println((int)(pi*1000));    //3141
		System.out.println(((int)(pi*1000))/1000.0);   // 3141 ������ 1000.0   
		
	}

}
