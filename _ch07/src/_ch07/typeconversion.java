package _ch07;

public class typeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=null;
		FireEngine fe= new FireEngine();   // FireEngine �ν��Ͻ� ����
		FireEngine fe2= null;      
		fe.water();
		car =fe;   // �ڼ�->����. 5���� ����� 4���� ���̴°��� �����ϴ�. 
		// car.water();  error!  Car�� ����������δ� water() ȣ�� �Ұ�  
		fe2= (FireEngine)car;     // ����->�ڼ�. 4���� ����� 5���� ����� �ø��� ���� �����ϱ⶧���� Ÿ���� ��ȣ�ȿ� ������Ѵ�.  
		fe2.water();
		
		// ���� �ν��Ͻ��� �������� �ƴ°��� �߿��ϴ�.
		Car c= new Car();
		FireEngine ff= (FireEngine)c;
		// ff.water();  / error�� ����� ������ ff�� ����Ű�� ��ü�� Car�̹Ƿ� water() ����� �������� �ʴ´�.
		
	}
}



class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive");
	}
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
	
}