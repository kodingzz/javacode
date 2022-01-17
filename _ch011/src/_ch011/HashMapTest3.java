package _ch011;

import java.util.*;

public class HashMapTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		
		HashMap map =new HashMap();
		
		for(int i=0;i<data.length;i++) {
			if(map.containsKey(data[i])) {
				int val = (int)map.get(data[i]);
				map.put(data[i], val+1);
			}
			else 
				map.put(data[i], 1);
		}
		Iterator it =map.entrySet().iterator();
	
		while(it.hasNext()) {	
			Map.Entry e =(Map.Entry)it.next();
			System.out.println(e.getKey()+":"+printBar('#',(int)e.getValue())+" "+(int)e.getValue());
		}
		}

	private static String printBar(char c, int value) {
		// TODO Auto-generated method stub
		char[] bar= new char[value];
		for(int i=0;i<bar.length;i++)
			bar[i]=c;
		
		return new String(bar);
	}
}
