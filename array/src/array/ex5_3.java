package array;



public class ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score= {79,88,91,33,100,55,95};
		
		int max=score[0];
		int min=score[0];               // min, max�� score[0]������ �ʱ�ȭ
		
		for(int i=1;i<score.length;i++) { 
			if(score[i]>max)
				max=score[i];
			else if(score[i]<min)
				min=score[i];                
		} 
		System.out.println("�ִ밪 :"+max);
		System.out.println("�ּҰ� :"+min);
	}
}