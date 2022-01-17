package _ch10;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();  // Calendar 객체 생성  
		System.out.println("이 해의 년도: "+cal.get(Calendar.YEAR));
		System.out.println("월(0~11,0:1월): "+cal.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주: "+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주: "+cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇 일: "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일: "+cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일): "+cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇번째 요일: "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전, 1:오후): "+cal.get(Calendar.AM_PM));
		System.out.println("시간(0~11): "+cal.get(Calendar.HOUR));
		System.out.println("시간(0~11): "+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("시간(0~23): "+cal.get(Calendar.MINUTE));
		System.out.println("초(0~59): "+cal.get(Calendar.SECOND));
		
		
		

	}

}
