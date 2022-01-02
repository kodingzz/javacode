package _ch06;

public class ex6_11 {

	public static void main(String[] args) {      // 스택에 main메서드가 먼저 쌓인다.
		// TODO Auto-generated method stub
		Data_1 d1= new Data_1();           // 기본 생성자 호출
		Data_2 d2= new Data_2();           // 기본 생성자 호출  error!! Data_2 클래스에 기본생성자가 없음. 추가해줘야함
	}
}



class Data_1{
	int value;            // 생성자가 아예 없는 경우 컴파일러가 기본생성자 추가
}

class Data_2{
	int value;
	
	Data_2() {} 	  // 기본생성자 추가
	Data_2(int x){
		value=x;                 // 매개변수 있는 생성자
	}
}