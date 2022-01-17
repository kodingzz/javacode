package _ch10;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			System.out.println("Usage : java Ex_10_5 2019 9");
			return;
		}
		int year=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK=0;
		int END_DAY=0;
		
		Calendar sday= Calendar.getInstance();  //������
		Calendar eday= Calendar.getInstance();  //���� 
		
		sday.set(year,month-1,1);  // month�� 0���� ����  
		eday.set(year, month,1);
		
		START_DAY_OF_WEEK=sday.get(Calendar.DAY_OF_WEEK); // ù��° ������ ������������ �˾Ƴ���.  
		
		END_DAY = eday.get(Calendar.DATE);  // eday�� ������ ��¥�� ���´�.  
		
		System.out.println("      "+year+"�� "+month+"�� ");
		System.out.println("  SU MO TU WE TH FR SA");
		//�ش� ���� 1���� ������������� ���� ������ ����Ѵ�.  
		// ���� 1���� �������̸� ������ ������´�.(�Ͽ��Ϻ���)  
		for(int i=1;i<START_DAY_OF_WEEK;i++) {
			System.out.print("   ");
		}
		for(int i=1,n=START_DAY_OF_WEEK;i<=END_DAY;i++,n++) {
			System.out.print((i<10)? "  "+i: " "+i);
			if(n%7==0) System.out.println();
		}
		
	}
}		
