package array;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rsp= {"가위","바위","보"};
		
		for(int i=0;i<10;i++) {
			int n=(int)(Math.random()*3);
			System.out.println(rsp[n]);
		}
}	
}