package _ch011;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set= new TreeSet();        // 범위 검색, 정렬에 유리하다. 정렬 따로 필요없다.
	//	for(int i=0;set.size()<6;i++) {
	//		int num=(int)(Math.random()*45)+1;
			set.add(new Test());     // set(new Integer(num));     / Integer클래스는 Comparable을 가지고 있기때문에 문제가없다.
		
		System.out.println(set);
		
		
	}
}

class Test implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}
}

