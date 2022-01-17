package _ch011;


import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);  // 기본길이가 10인 ArrayList를 생성  
		list1.add(5);  // ArrayList에는 객체만 저장가능하다. 그러나 오토박싱에 의해 기본형이 참조형으로 자동변환된다.
		list1.add(4);  // list1.add(new Integer(4));
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(0);

		ArrayList list2=new ArrayList(list1.subList(1,4));
		print(list1,list2);
		
		Collections.sort(list1);         //Collection은 인터페이스 Collections는 유틸 클래스이다.
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containAll(list2):"+list1.containsAll(list2));  //list1이 list2요소를 모두 포함하고 있는지?
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1,list2);
		
		list2.set(3,"AA");
		print(list1,list2);
		
		list1.add(0,"1");  //0번째 index에 문자열 "1"을 넣는다.
		print(list1,list2);
		System.out.println("index="+list1.indexOf(1));  // indexOf()는 지정된 객체(integer 1)의 index위치를 알려준다.  
		
		list1.remove(1);  // 1번 index 삭제  
		print(list1,list2);
		list1.remove(new Integer(1));  // integer 1 삭제  
		print(list1,list2);
		
		
	}
		
		
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
	}

}