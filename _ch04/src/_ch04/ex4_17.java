package _ch04;
import java.util.Scanner;
public class ex4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			if(i%3==0)                      //0, 3�� ��� �����ϰ� ���
				continue;
			System.out.println(i);
		}
	}
}