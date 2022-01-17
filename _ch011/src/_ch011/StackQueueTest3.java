package _ch011;

import java.util.*;

public class StackQueueTest3 {
	static Queue q2 =new LinkedList();
	static final int MAX_SIZE=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s= new Scanner(System.in);
				String input =s.nextLine().trim();

				if("".equals(input))          //  공백이면 다시입력
					continue;
				if(input.equalsIgnoreCase("q"))              // q입력
					System.exit(0); 
				else if(input.equalsIgnoreCase("help")) {         // help입력
					System.out.println(" help- 도움말을 보여줍니다."); 
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를"+ MAX_SIZE+"개 보여줍니다.");
				}
				
				else if(input.equalsIgnoreCase("history")) {       // history 입력
					save(input);
					LinkedList list= (LinkedList)q2;
					for(int i=0;i<list.size();i++)
						System.out.println((i+1)+"."+list.get(i));
				}
				
				else {                   // 일반 문자 입력
					save(input);
					System.out.println(input);
				}
				
				}catch(Exception e) {
					System.out.println("입력오류입니다.");
				}
			
		}

	}
	public static void save(String input) {
		if(!"".equals(input))
			q2.offer(input);      // input이 공백이 아니면 q2에 저장한다.
			
		if(q2.size()>MAX_SIZE)
			q2.remove();         // q2사이즈가 MAX_SIZE를 넘어서면 제일처음 입력된것을 삭제한다.  
	}
}
