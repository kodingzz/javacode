package _ch09;


public class IntegerStringTranslate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ival=100;
		String strval=String.valueOf(ival);    // ���ڸ� ���ڿ��� �ٲٴ� 1��° ���
		double dval=200.0;
		String strval2=dval+"";   // ���ڸ� ���ڿ��� �ٲٴ� 2��° ���
		
		
		double sum=Integer.parseInt(strval)+Double.parseDouble(strval2);
		double sum2=Integer.valueOf(strval)+Double.valueOf(strval2);
	
		System.out.println(String.join("",strval,"+",strval2,"=" )+sum);   //join()�� �̿��ؼ� ���� ���ڿ� ���̿� �������־ �����Ѵ�.
	}
}