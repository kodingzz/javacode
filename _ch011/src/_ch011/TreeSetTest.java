package _ch011;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set= new TreeSet();        // ���� �˻�, ���Ŀ� �����ϴ�. ���� ���� �ʿ����.
	//	for(int i=0;set.size()<6;i++) {
	//		int num=(int)(Math.random()*45)+1;
			set.add(new Test());     // set(new Integer(num));     / IntegerŬ������ Comparable�� ������ �ֱ⶧���� ����������.
		
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

