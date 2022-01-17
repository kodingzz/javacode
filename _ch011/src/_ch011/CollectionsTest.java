package _ch011;

import java.util.*;
import static java.util.Collections.*; // Collections를 생략 가능하다.

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list =new ArrayList();
		System.out.println(list);
		
		addAll(list,1,2,3,4,5);  // Collections.addAll(list,1,2,3,4,5);
		System.out.println(list);
		
		rotate(list,2);  // 반시계 방향으로 두번회전
		System.out.println(list);
		
		swap(list,0,2);  //첫번째 세번째 교환  
		System.out.println(list);
		
		shuffle(list);
		System.out.println(list);
		
		sort(list,reverseOrder());
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		int idx= binarySearch(list,3);   // 3의 index위치  
		System.out.println("index of 3: "+idx);
		
		System.out.println("max="+max(list));
		System.out.println("min="+min(list));
		System.out.println("min="+max(list,reverseOrder()));
		
		fill(list,9);
		System.out.println("list="+list);
		
		List newlist =nCopies(list.size(),2);   // list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 
		System.out.println("newlist="+newlist);
		
		System.out.println(disjoint(list,newlist));  // 두 배열에 공통요소 없으면 true반환
		copy(list,newlist);  // newlist값을 list에 복사
		System.out.println("list="+list);
		
		replaceAll(list,2,1);  // list에서 2를 1로 변환
		System.out.println("list="+list);
	}

}
