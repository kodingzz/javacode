package _ch10;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();  // Calendar ��ü ����  
		System.out.println("�� ���� �⵵: "+cal.get(Calendar.YEAR));
		System.out.println("��(0~11,0:1��): "+cal.get(Calendar.MONTH));
		System.out.println("�� ���� �� ° ��: "+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° ��: "+cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�� ���� �� ��: "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� �� ��: "+cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(1~7, 1:�Ͽ���): "+cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("�� ���� ���° ����: "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("����_����(0:����, 1:����): "+cal.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11): "+cal.get(Calendar.HOUR));
		System.out.println("�ð�(0~11): "+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("�ð�(0~23): "+cal.get(Calendar.MINUTE));
		System.out.println("��(0~59): "+cal.get(Calendar.SECOND));
		
		
		

	}

}
