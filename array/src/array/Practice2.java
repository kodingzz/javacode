package array;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCDE";
		char ch=str.charAt(3);   // str의 index=3 가져오기
		System.out.println(ch);
		
		String str2=str.substring(1,4);  // 1~3
		String str3=str.substring(1);  // 1~4
		System.out.println(str2);            
		System.out.println(str3);
		
		
}	
}