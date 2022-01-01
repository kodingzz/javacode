package array;

import java.util.Arrays;

public class ex5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numarr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numarr));
		
		for(int i=0;i<100;i++) {
			int n=(int)(Math.random()*10);
			int tmp= numarr[1];
			numarr[1]=numarr[n];        // numarr[1]과 numarr[n]의 값 100번  shuffle!
			numarr[n]=tmp;
		}
		System.out.println(Arrays.toString(numarr));
	}
}