package array;


public class ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball=new int[45];
		
		for(int i=0;i<ball.length;i++)         // 배열의 각요소에 1~45의 값 저장
			ball[i]=i+1;
	
		for(int i=0;i<6;i++) {
			int n=(int)(Math.random()*45);       // n에 임의의값 저장  0~44범위
			int tmp=ball[i];                   // 두 값을 바꾼느데 사용할 tmp
			ball[i]=ball[n];
			ball[n]=tmp;
		}
		for(int i=0;i<6;i++)           /// 배열 ball 앞의 6개값만 출력
			System.out.printf("ball[%d]=%d\n",i,ball[i]);
	}
}