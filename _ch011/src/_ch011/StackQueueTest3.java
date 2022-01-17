package _ch011;

import java.util.*;

public class StackQueueTest3 {
	static Queue q2 =new LinkedList();
	static final int MAX_SIZE=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s= new Scanner(System.in);
				String input =s.nextLine().trim();

				if("".equals(input))          //  �����̸� �ٽ��Է�
					continue;
				if(input.equalsIgnoreCase("q"))              // q�Է�
					System.exit(0); 
				else if(input.equalsIgnoreCase("help")) {         // help�Է�
					System.out.println(" help- ������ �����ݴϴ�."); 
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ"+ MAX_SIZE+"�� �����ݴϴ�.");
				}
				
				else if(input.equalsIgnoreCase("history")) {       // history �Է�
					save(input);
					LinkedList list= (LinkedList)q2;
					for(int i=0;i<list.size();i++)
						System.out.println((i+1)+"."+list.get(i));
				}
				
				else {                   // �Ϲ� ���� �Է�
					save(input);
					System.out.println(input);
				}
				
				}catch(Exception e) {
					System.out.println("�Է¿����Դϴ�.");
				}
			
		}

	}
	public static void save(String input) {
		if(!"".equals(input))
			q2.offer(input);      // input�� ������ �ƴϸ� q2�� �����Ѵ�.
			
		if(q2.size()>MAX_SIZE)
			q2.remove();         // q2����� MAX_SIZE�� �Ѿ�� ����ó�� �ԷµȰ��� �����Ѵ�.  
	}
}
