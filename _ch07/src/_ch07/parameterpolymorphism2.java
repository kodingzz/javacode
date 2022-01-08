package _ch07;

public class parameterpolymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buyer1 b = new buyer1();  // buyer 인스턴스 생성
		b.buy(new Tv2());  //Product p =new Tv2();
		b.buy(new Computer2());  // product p = new Computer2();
		b.buy(new Audio2());  // product p = new Audio2();
//		System.out.println("현재 남은 돈은 "+ b.money+ "만원입니다.");
//		System.out.println("현재 남은 포인트는 "+ b.bonuspoint+ "점입니다.");
		b.summary();
	}

}

class product1{
	int price;
	int bonuspoint;   
	
	product1(int price){           // product 생성자 
		this.price=price;
		bonuspoint=(int)(price/10.0);
	}
}

class Tv2 extends product1{
	Tv2(){super(100); }      // product의 생성자로가서 100대입하여 price, bonuspoint값 구하기
	public String toString() {return "Tv"; }          // toString() 메서드
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
	product1[] cart=new product1[10];  // 구입한 제품을 저장하기위한 배열  
	int i=0;
	void buy(product1 p) {        // buy 메서드, 매개변수를 참조변수로 둔다.
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
	}
		money-=p.price;
		bonuspoint+=p.bonuspoint;
		cart[i++]=p;  //  참조변수 p가 가리키고 있는 인스턴스 주소를 cart변수도 가리킨다.
		System.out.println(p+"을/를 구매하셨습니다.");
	}
	void summary() {          // summary 메서드 
		int sum=0;
		String itemlist="";
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null)           // 비워져있다면 break;
				break;
			sum+=cart[i].price;
//			itemlist+=cart[i]+", ";
			itemlist+=cart[i].toString()+", ";
			}
		System.out.println("구입하신 물품의 총 금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemlist+"입니다.");
	}
	
}