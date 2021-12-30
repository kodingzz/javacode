package _ch04;
import java.util.Scanner;
public class ex4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sum=0;
		while(sum<=100) {
			System.out.printf("%d - %d\n",i,sum);
			i++;
			sum+=i;  
			// sum+=++i;
		}
	}
}

