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
		
		Calendar sday= Calendar.getInstance();  //시작일
		Calendar eday= Calendar.getInstance();  //끝일 
		
		sday.set(year,month-1,1);  // month는 0부터 시작  
		eday.set(year, month,1);
		
		START_DAY_OF_WEEK=sday.get(Calendar.DAY_OF_WEEK); // 첫번째 요일이 무슨요일인지 알아낸다.  
		
		END_DAY = eday.get(Calendar.DATE);  // eday에 지정된 날짜를 얻어온다.  
		
		System.out.println("      "+year+"년 "+month+"월 ");
		System.out.println("  SU MO TU WE TH FR SA");
		//해당 월의 1일이 어느요일인지에 따라서 공백을 출력한다.  
		// 만일 1일이 수요일이면 공백을 세번찍는다.(일요일부터)  
		for(int i=1;i<START_DAY_OF_WEEK;i++) {
			System.out.print("   ");
		}
		for(int i=1,n=START_DAY_OF_WEEK;i<=END_DAY;i++,n++) {
			System.out.print((i<10)? "  "+i: " "+i);
			if(n%7==0) System.out.println();
		}
		
	}
}		
