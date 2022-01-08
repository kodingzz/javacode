package _ch07;

public class parameterpolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buyer b = new buyer();  // buyer �ν��Ͻ� ����
		b.buy(new Tv1());  //Product p =new Tv1();
		b.buy(new Computer1());  // product p = new Computer1();
		System.out.println("���� ���� ���� "+ b.money+ "�����Դϴ�.");
		System.out.println("���� ���� ����Ʈ�� "+ b.bonuspoint+ "���Դϴ�.");
	}

}

class product{
	int price;
	int bonuspoint;   
	
	product(int price){           // product ������ 
		this.price=price;
		bonuspoint=(int)(price/10.0);
	}
}

class Tv1 extends product{
	Tv1(){super(100); }      // product�� �����ڷΰ��� 100�����Ͽ� price, bonuspoint�� ���ϱ�	
	public String toString() {return "Tv"; }          // toString() �޼���
}

class Computer1 extends product{
	Computer1(){ super(200);}
	public String toString() { return "Computer";}
	
}

class buyer{
	int money=1000;
	int bonuspoint=0;
	
	void buy(product p) {        // buy �޼���, �Ű������� ���������� �д�.
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
	}
		money-=p.price;
		bonuspoint+=p.bonuspoint;
		System.out.println(p+"��/�� �����ϼ̾��ϴ�.");
	}
	
}