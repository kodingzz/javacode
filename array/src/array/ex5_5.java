package array;


public class ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball=new int[45];
		
		for(int i=0;i<ball.length;i++)         // �迭�� ����ҿ� 1~45�� �� ����
			ball[i]=i+1;
	
		for(int i=0;i<6;i++) {
			int n=(int)(Math.random()*45);       // n�� �����ǰ� ����  0~44����
			int tmp=ball[i];                   // �� ���� �ٲ۴��� ����� tmp
			ball[i]=ball[n];
			ball[n]=tmp;
		}
		for(int i=0;i<6;i++)           /// �迭 ball ���� 6������ ���
			System.out.printf("ball[%d]=%d\n",i,ball[i]);
	}
}