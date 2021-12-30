package _ch04;
import java.util.Scanner;
public class ex4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=1;i<=10;i++) {                
			num=(int)(Math.random()*6)+1;               //math.random()은 0.0~1.0 사이의 난수이다. 
			//System.out.println(Math.random()*6); // 0.0<=x<6.0
			//System.out.println((int)(Math.random()*6)); // 0<=x<6
			//System.out.println((int)(Math.random()*6)+1); // 1<=x<7
			
 			System.out.println(num);
		}
	}
		
}
