package _ch03;

public class ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5,j=0;
		j=i++;   //후위형
		System.out.println("j=i++; 실행 후, i= "+i+", j= "+j);  // i,j값 다름
		
		i=5;
		j=0;
		j=++i;  //전위형
		System.out.println("j=i++; 실행 후, i= "+i+", j= "+j);  // i,j값 동일
		
	}

}
