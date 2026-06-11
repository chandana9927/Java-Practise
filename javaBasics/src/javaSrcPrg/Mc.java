package javaSrcPrg;

class Meesho_v1{
	void order() {
		System.out.println("Order clothes");
	}
}

class Meesho_v2 extends Meesho_v1{
	void order() {
		super.order();
		System.out.println("Order clothes, and other accessories");
	}
}

public class Mc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meesho_v2 mo1 = new Meesho_v2();
		mo1.order();
	}

}
