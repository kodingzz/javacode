package _ch09;

import java.util.ArrayList;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100)); // 원래는 list에는 객체만 추가가능하였다
		list.add(100); // JDK 1.5이후 이런식으로 표현해줘도 컴파일러가 자동으로 객체 생성해준다.  
		
//		Integer i =list.get(0);         // list에 저장된 첫번째 객체를 꺼낸다. 
//		int i = list.get(0).intValue();  // intValue()로 Integer를 int로 변환한다.  
		int i =list.get(0);  // 컴파일러가 알아서 intValue()를 추가해준다.
	}

}
