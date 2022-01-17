package _ch09;


public class RountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=new Integer("100").intValue();
	int i2=Integer.parseInt("100");
	int i3=Integer.valueOf("100");
	
	int i4=Integer.parseInt("100",2);
	int i5=Integer.parseInt("100",8);
	Integer i6=Integer.valueOf("100",16);
	
	System.out.println(i);
	System.out.println(i2);
	System.out.println(i3);
	System.out.println(i4);
	System.out.println(i5);
	System.out.println(i6);

	}
}
	