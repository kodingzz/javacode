package _ch09;


public class equalsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person(8011081111222L);
		Person p2= new Person(8011081111222L);
		
		if(p1.equals(p2))
			System.out.println("p1�� p2�� �����ϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ��ϴ�.");

	}

}
class Person{
	long id;
	
	Person(long id){
		this.id=id;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;  // ����ȯ���� �ݵ�� instanceof�� Ȯ��
		return  this.id== ((Person)obj).id;
	}  
	
}
