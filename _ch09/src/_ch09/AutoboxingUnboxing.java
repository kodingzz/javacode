package _ch09;

import java.util.ArrayList;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100)); // ������ list���� ��ü�� �߰������Ͽ���
		list.add(100); // JDK 1.5���� �̷������� ǥ�����൵ �����Ϸ��� �ڵ����� ��ü �������ش�.  
		
//		Integer i =list.get(0);         // list�� ����� ù��° ��ü�� ������. 
//		int i = list.get(0).intValue();  // intValue()�� Integer�� int�� ��ȯ�Ѵ�.  
		int i =list.get(0);  // �����Ϸ��� �˾Ƽ� intValue()�� �߰����ش�.
	}

}
