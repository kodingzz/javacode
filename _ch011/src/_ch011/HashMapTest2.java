package _ch011;

import java.util.*;

public class HashMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map =new HashMap();
		
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(95));
		map.put("���ڹ�", new Integer(90));
		
		Set set = map.entrySet();
		Iterator it =set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry)it.next();	
			System.out.println("�̸�: "+e.getKey()+", ����: "+e.getValue());
		}
		set=map.keySet();
		System.out.println("������ ���: "+set);
		
		Collection values = map.values();
		it =values.iterator();
		
		int total=0;
		while(it.hasNext()) {
			int i= (int)it.next();
			total+=i;
		}
		System.out.println("����: "+total);
		System.out.println("���: "+(float)total/set.size());
		System.out.println("�ְ�����: "+Collections.max(values));
		System.out.println("��wjHashMapTest.java����: "+Collections.min(values));

	}
}
