package _ch011;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objarr= {"1",new Integer(1),"2","2","3","4","4","4"};
		Set set = new HashSet();     
		
		for(int i=0;i<objarr.length;i++)
			set.add(objarr[i]);         // Hashset안에 objarr요소들을 저장한다
		System.out.println(set);

		Iterator it =set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
