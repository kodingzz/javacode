package _ch07;

public class parameterpolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buyer b = new buyer();  // buyer 인스턴스 생성
		b.buy(new Tv1());  //Product p =new Tv1();
		b.buy(new Computer1());  // product p = new Computer1();
		System.out.println("현재 남은 돈은 "+ b.money+ "만원입니다.");
		System.out.println("현재 남은 포인트는 "+ b.bonuspoint+ "점입니다.");
	}

}

class product{
	int price;
	int bonuspoint;   
	
	product(int price){           // product 생성자 
		this.price=price;
		bonuspoint=(int)(price/10.0);
	}
}

class Tv1 extends product{
	Tv1(){super(100); }      // product의 생성자로가서 100대입하여 price, bonuspoint값 구하기	
	public String toString() {return "Tv"; }          // toString() 메서드
}

class Computer1 extends product{
	Computer1(){ super(200);}
	public String toString() { return "Computer";}
	
}

class buyer{
	int money=1000;
	int bonuspoint=0;
	
	void buy(product p) {        // buy 메서드, 매개변수를 참조변수로 둔다.
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
	}
		money-=p.price;
		bonuspoint+=p.bonuspoint;
		System.out.println(p+"을/를 구매하셨씁니다.");
	}
	
}