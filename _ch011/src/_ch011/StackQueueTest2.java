package _ch011;

import java.util.*;

public class StackQueueTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack sta= new Stack();
		String expression="((3+5)*8-2)";
		
		try {
			for (int i=0; i<expression.length();i++) {
				char ch=expression.charAt(i);
				if(ch=='(')
					sta.push(ch);
				else if( ch==')')
					sta.pop();
			} 
		if (sta.isEmpty())
			System.out.println("��ȣ�� ��ġ�մϴ�.");
		else
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}catch(EmptyStackException e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");   // �ݴ°�ȣ�� ������� ���� �߻� 
		}
	}
}
