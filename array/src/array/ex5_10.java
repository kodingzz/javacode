package array;

import java.util.Scanner;

public class ex5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words= {
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer","����"}
		};
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s�� ����?",i+1,words[i][0]);
			String answer=scanner.nextLine();
			if(answer.equals(words[i][1]))                  // �O��!! answer==words[i][1] (x) 
				System.out.println("�����Դϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�. ������ "+words[i][1]+"�Դϴ�.");
		}
		
		
	}
}