package array;


public class ex5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},                
				{50,50,50}
		};
		int kortotal=0,engtotal=0,mathtotal=0;             // ����,����, ���� ������ ���� 
		System.out.println("��ȣ  ����  ����  ����  ����  ���");
		System.out.println("============================");
		for(int i=0;i<score.length;i++)
		{
			int sum=0;
			float average=0.0f;
			kortotal+=score[i][0];
			engtotal+=score[i][1];
			mathtotal+=score[i][2];
			System.out.printf("%3d",i+1);            // ����+����+������ �� sum, ���� ���� ������ ��� average
			
			for(int j=0;j<score[i].length;j++)
			{
				sum+=score[i][j];
			System.out.printf("%5d",score[i][j]);
			
		}
			average=sum/(float)score[i].length;
			System.out.printf("%5d",sum);
			System.out.printf(" %5.1f\n",average);    // sum�� average�� ��� 
		}
		
		
		
	}
}