package javaSrcPrg;

class Amazon_v1{
	void pay() {
		System.out.println("Pay through scan");
	}
}

class Amazon_v2 extends Amazon_v1{
	void pay() {
		super.pay();
		System.out.println("Pay through scan, phone number or UPI");
	}
}

public class Maincls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon_v2 ap1 = new Amazon_v2();
		ap1.pay();

	}

}
