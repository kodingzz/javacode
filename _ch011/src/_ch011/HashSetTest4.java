package _ch011;

import java.util.*;

public class HashSetTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet setA =new HashSet();
		HashSet setB =new HashSet();
		HashSet sethab =new HashSet();
		HashSet setgyo=new HashSet();
		HashSet setcha=new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A="+setA);
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B="+setB);
		
		//������
		Iterator it= setB.iterator();
		while(it.hasNext()) {
			Object tmp= it.next();
			if(setA.contains(tmp))
					setgyo.add(tmp);        // setA.retainAll(setB);
		}
		//������
		it=setA.iterator();
		while(it.hasNext()) {
			Object tmp=it.next();
			if(!(setB.contains(tmp)))
				setcha.add(tmp);
		}
		//������
		it=setA.iterator();
		while(it.hasNext()) {
			sethab.add(it.next());        // setA.addAll(setB);
		}
		it=setB.iterator();
		while(it.hasNext()) {
			sethab.add(it.next());
		}       // sethab�� �ߺ��Ȱ��� �������.
		
		System.out.println("������:"+sethab);
		System.out.println("������:"+setgyo);
		System.out.println("������:"+setcha);
		
	}
	
	
}
