package _ch07;

class Myparent{
	private int prv;
	int dft;
	protected int prt;
	public int pub;
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);         // 같은 클래스 안에 있기 때문에 모두다 ok
	}
	
}


public class Accesmodifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myparent mp = new Myparent();
		//System.out.println(mp.prv);     // prv는 private이므로 다른 클래스에 있으면 접근불가 error!
		System.out.println(mp.dft);
		System.out.println(mp.prt);
		System.out.println(mp.pub);
	}
}
