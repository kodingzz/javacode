package _ch04;

public class pr4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,i=0,sum=0;
		while(sum<100) {
		count++;
		i++;
			if(count%2==0)
				sum+=-i;
			else
				sum+=i;
			
		}
		System.out.println(i);
	}
}