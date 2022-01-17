package _ch011;

import java.util.*;

public class HashSetTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");  //�ߺ��̶� ����ȵ�. 
		set.add(new Person("David",20)); 
		set.add(new Person("David",20));  

		System.out.println(set);
	}

}
// equals()�� hashCode()�� �������̵��ؾ� HashSet�� �ٸ��� �۵��Ѵ�.
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;
		Person p =(Person)obj;
		return name.equals(p.name)&& age==p.age;        // �� �ڽ��� �̸��� ���̸� p�� ���Ѵ�.
	
	}
	public String toString() {
		return name+":"+age;
	}
	
	
}
