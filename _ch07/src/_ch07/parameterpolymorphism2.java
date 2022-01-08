package _ch07;

public class parameterpolymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buyer1 b = new buyer1();  // buyer �ν��Ͻ� ����
		b.buy(new Tv2());  //Product p =new Tv2();
		b.buy(new Computer2());  // product p = new Computer2();
		b.buy(new Audio2());  // product p = new Audio2();
//		System.out.println("���� ���� ���� "+ b.money+ "�����Դϴ�.");
//		System.out.println("���� ���� ����Ʈ�� "+ b.bonuspoint+ "���Դϴ�.");
		b.summary();
	}

}

class product1{
	int price;
	int bonuspoint;   
	
	product1(int price){           // product ������ 
		this.price=price;
		bonuspoint=(int)(price/10.0);
	}
}

class Tv2 extends product1{
	Tv2(){super(100); }      // product�� �����ڷΰ��� 100�����Ͽ� price, bonuspoint�� ���ϱ�
	public String toString() {return "Tv"; }          // toString() �޼���
}

class Computer2 extends product1{
	Computer2(){ super(200);}
	public String toString() { return "Computer";}
	
}

class Audio2 extends product1{
	Audio2(){ super(300);}
	public String toString() { return "Audio";}
	
}

class buyer1{
	int money=1000;
	int bonuspoint=0;
	product1[] cart=new product1[10];  // ������ ��ǰ�� �����ϱ����� �迭  
	int i=0;
	void buy(product1 p) {        // buy �޼���, �Ű������� ���������� �д�.
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
	}
		money-=p.price;
		bonuspoint+=p.bonuspoint;
		cart[i++]=p;  //  �������� p�� ����Ű�� �ִ� �ν��Ͻ� �ּҸ� cart������ ����Ų��.
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	void summary() {          // summary �޼��� 
		int sum=0;
		String itemlist="";
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null)           // ������ִٸ� break;
				break;
			sum+=cart[i].price;
//			itemlist+=cart[i]+", ";
			itemlist+=cart[i].toString()+", ";
			}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� "+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemlist+"�Դϴ�.");
	}
	
}