
package array;

import java.util.Arrays;

public class ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,95,96,97,98};
		System.out.println(Arrays.toString(arr));        // ctrl+shift + o : import 문장 자동 생성
		
		int[] iarr1= new int[10];
		int[] iarr2=new int[10];
		int[] iarr3= {100,95,80,70,60};
		char[] charr= {'a','b','c','d'};
		
		for(int i=0;i<iarr1.length;i++) 
			iarr1[i]=i+1;
		for(int i=0;i<iarr2.length;i++)
			iarr2[i]=(int)(Math.random()*10)+1;
		
		for(int i=0;i<iarr1.length;i++)
			System.out.printf("%d,",iarr1[i]);
		
		System.out.println();
		
		System.out.println(Arrays.toString(iarr2));   // Arrays.toString() ->[....] 출력
		System.out.println(Arrays.toString(iarr3));
		System.out.println(Arrays.toString(charr));
		System.out.println(iarr3);      
		System.out.println(charr);  // char형 배열은 내용 그대로 나온다 

	}

}
