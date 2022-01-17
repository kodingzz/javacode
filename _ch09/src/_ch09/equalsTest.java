package _ch09;


public class equalsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1= new Value(10);
		Value v2= new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");

	}

}
class Value{
	int value;
	
	Value(int value){
		this.value=value;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Value)) return false;  // 형변환전에 반드시 instanceof로 확인
		Value v= (Value)obj;    // obj는 value버튼이 없으므로 형변환
		return this.value==v.value;
	}  // 기존 return ths==value  / 주소비교. 사로다른 객체는 항상 거짓
	
}
