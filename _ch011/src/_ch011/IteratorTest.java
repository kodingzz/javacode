package _ch011;

import java.util.*;
public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection list=new ArrayList();   //Collection list= new HashSet(); ���� set�� collection�� �ڼ��̹Ƿ� 
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
