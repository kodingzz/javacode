package _ch011;


import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);  // �⺻���̰� 10�� ArrayList�� ����  
		list1.add(5);  // ArrayList���� ��ü�� ���尡���ϴ�. �׷��� ����ڽ̿� ���� �⺻���� ���������� �ڵ���ȯ�ȴ�.
		list1.add(4);  // list1.add(new Integer(4));
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(0);

		ArrayList list2=new ArrayList(list1.subList(1,4));
		print(list1,list2);
		
		Collections.sort(list1);         //Collection�� �������̽� Collections�� ��ƿ Ŭ�����̴�.
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containAll(list2):"+list1.containsAll(list2));  //list1�� list2��Ҹ� ��� �����ϰ� �ִ���?
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1,list2);
		
		list2.set(3,"AA");
		print(list1,list2);
		
		list1.add(0,"1");  //0��° index�� ���ڿ� "1"�� �ִ´�.
		print(list1,list2);
		System.out.println("index="+list1.indexOf(1));  // indexOf()�� ������ ��ü(integer 1)�� index��ġ�� �˷��ش�.  
		
		list1.remove(1);  // 1�� index ����  
		print(list1,list2);
		list1.remove(new Integer(1));  // integer 1 ����  
		print(list1,list2);
		
		
	}
		
		
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
	}

}