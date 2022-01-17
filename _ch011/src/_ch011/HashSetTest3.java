package _ch011;

import java.util.*;

public class HashSetTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");  //중복이라 저장안됨. 
		set.add(new Person("David",20)); 
		set.add(new Person("David",20));  

		System.out.println(set);
	}

}
// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 작동한다.
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
		return name.equals(p.name)&& age==p.age;        // 나 자신의 이름과 나이를 p와 비교한다.
	
	}
	public String toString() {
		return name+":"+age;
	}
	
	
}
