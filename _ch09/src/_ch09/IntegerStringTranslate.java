package _ch09;


public class IntegerStringTranslate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ival=100;
		String strval=String.valueOf(ival);    // 숫자를 문자열로 바꾸는 1번째 방법
		double dval=200.0;
		String strval2=dval+"";   // 숫자를 문자열로 바꾸는 2번째 방법
		
		
		double sum=Integer.parseInt(strval)+Double.parseDouble(strval2);
		double sum2=Integer.valueOf(strval)+Double.valueOf(strval2);
	
		System.out.println(String.join("",strval,"+",strval2,"=" )+sum);   //join()을 이용해서 여러 문자열 사이에 공백을넣어서 결합한다.
	}
}