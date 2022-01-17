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
		
		System.out.println(set);  // 정렬되지 않은 상태로 결과 출력
		
		List list = new LinkedList(set);   // set의 모든 요소를 list에 저장
		Collections.sort(list);  // list정렬
		System.out.println(list);   // list를 출력
	}

}
