package array;

import java.util.Scanner;

public class ex5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?",i+1,words[i][0]);
			String answer=scanner.nextLine();
			if(answer.equals(words[i][1]))                  // 즁요!! answer==words[i][1] (x) 
				System.out.println("정답입니다.");
			else
				System.out.println("틀렸습니다. 정답은 "+words[i][1]+"입니다.");
		}
		
		
	}
}