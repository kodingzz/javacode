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
		System.out.println(pub);         // ���� Ŭ���� �ȿ� �ֱ� ������ ��δ� ok
	}
	
}


public class Accesmodifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myparent mp = new Myparent();
		//System.out.println(mp.prv);     // prv�� private�̹Ƿ� �ٸ� Ŭ������ ������ ���ٺҰ� error!
		System.out.println(mp.dft);
		System.out.println(mp.prt);
		System.out.println(mp.pub);
	}
}
