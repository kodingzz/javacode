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
			System.out.println("id�� password�� �Է��ϼ���.");
			System.out.print("id: ");
			String id =s.nextLine().trim(); // ������ �־ ���̵� ������ ��ġ�ϴٰ� �Ǵ��ϱ� ���ؼ� 
			
			System.out.print("password: ");
			String password =s.nextLine().trim();  // ������ �־ ����� ������ ��ġ�ϴٰ� �Ǵ��ϱ� ���ؼ� 
	
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ��Է����ּ���.");
				continue;
			}
			if(!map.containsValue(password)) {
				System.out.println("�Է��Ͻ� password�� �������� �ʽ��ϴ�. �ٽ��Է����ּ���.");
				continue;
			}
			
		System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
		break;
	
	}

}
}
