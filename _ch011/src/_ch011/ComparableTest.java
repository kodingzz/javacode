package _ch011;

import java.util.*;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strarr= {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strarr); // String의 Comaparable 구현에의한 정렬  
		System.out.println("strarr="+Arrays.toString(strarr));
		Arrays.sort(strarr,String.CASE_INSENSITIVE_ORDER);  // 대소문자 구별 X  
		System.out.println("strarr="+Arrays.toString(strarr));
		Arrays.sort(strarr,new Descending());
		System.out.println("strarr="+Arrays.toString(strarr));
		
	}
	}
	

class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String) {
			String c1 = (String)o1;
			String c2 = (String)o2;
			return c1.compareTo(c2)*-1;   // -1을 곱해서 기본 정렬방식의 역으로 바꾼다.  
			
		}
		return -1;
	}

}
