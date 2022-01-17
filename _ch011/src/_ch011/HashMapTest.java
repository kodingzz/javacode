package _ch011;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map =new HashMap();
		map.put("khw090", "0909");
		map.put("khwland090", "0909");
		
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력하세요.");
			System.out.print("id: ");
			String id =s.nextLine().trim(); // 공백을 넣어도 아이디만 맞으면 일치하다고 판단하기 위해서 
			
			System.out.print("password: ");
			String password =s.nextLine().trim();  // 공백을 넣어도 비번만 맞으면 일치하다고 판단하기 위해서 
	
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시입력해주세요.");
				continue;
			}
			if(!map.containsValue(password)) {
				System.out.println("입력하신 password는 존재하지 않습니다. 다시입력해주세요.");
				continue;
			}
			
		System.out.println("id와 비밀번호가 일치합니다.");
		break;
	
	}

}
}
