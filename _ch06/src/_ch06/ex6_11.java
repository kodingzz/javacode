package _ch06;

public class ex6_11 {

	public static void main(String[] args) {      // ���ÿ� main�޼��尡 ���� ���δ�.
		// TODO Auto-generated method stub
		Data_1 d1= new Data_1();           // �⺻ ������ ȣ��
		Data_2 d2= new Data_2();           // �⺻ ������ ȣ��  error!! Data_2 Ŭ������ �⺻�����ڰ� ����. �߰��������
	}
}



class Data_1{
	int value;            // �����ڰ� �ƿ� ���� ��� �����Ϸ��� �⺻������ �߰�
}

class Data_2{
	int value;
	
	Data_2() {} 	  // �⺻������ �߰�
	Data_2(int x){
		value=x;                 // �Ű����� �ִ� ������
	}
}