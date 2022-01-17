package _ch011;

import java.util.*;
public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection list=new ArrayList();   //Collection list= new HashSet(); 가능 set는 collection의 자손이므로 
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it= list.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}

	}

}
