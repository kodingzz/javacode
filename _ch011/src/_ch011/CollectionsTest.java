package _ch011;

import java.util.*;
import static java.util.Collections.*; // Collections�� ���� �����ϴ�.

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list =new ArrayList();
		System.out.println(list);
		
		addAll(list,1,2,3,4,5);  // Collections.addAll(list,1,2,3,4,5);
		System.out.println(list);
		
		rotate(list,2);  // �ݽð� �������� �ι�ȸ��
		System.out.println(list);
		
		swap(list,0,2);  //ù��° ����° ��ȯ  
		System.out.println(list);
		
		shuffle(list);
		System.out.println(list);
		
		sort(list,reverseOrder());
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		int idx= binarySearch(list,3);   // 3�� index��ġ  
		System.out.println("index of 3: "+idx);
		
		System.out.println("max="+max(list));
		System.out.println("min="+min(list));
		System.out.println("min="+max(list,reverseOrder()));
		
		fill(list,9);
		System.out.println("list="+list);
		
		List newlist =nCopies(list.size(),2);   // list�� ���� ũ���� ���ο� list�� �����ϰ� 2�� ä���. 
		System.out.println("newlist="+newlist);
		
		System.out.println(disjoint(list,newlist));  // �� �迭�� ������ ������ true��ȯ
		copy(list,newlist);  // newlist���� list�� ����
		System.out.println("list="+list);
		
		replaceAll(list,2,1);  // list���� 2�� 1�� ��ȯ
		System.out.println("list="+list);
	}

}
