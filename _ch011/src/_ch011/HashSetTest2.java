package _ch011;

import java.util.*;

public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set =new HashSet();
		
		for(int i=0;set.size()<6;i++) {
			int num= (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		System.out.println(set);  // ���ĵ��� ���� ���·� ��� ���
		
		List list = new LinkedList(set);   // set�� ��� ��Ҹ� list�� ����
		Collections.sort(list);  // list����
		System.out.println(list);   // list�� ���
	}

}
