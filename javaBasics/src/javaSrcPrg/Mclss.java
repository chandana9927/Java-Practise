package javaSrcPrg;

class Facebook_v1{
	void message() {
		System.out.println("Text sent, upload stories");
	}
}

class Facebook_v2 extends Facebook_v1{
	void message() {
		//super.message();
		System.out.println("Text sent, can edit, remove and react, and upload stories");
		super.message();
	}
}

public class Mclss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook_v2 fb1 = new Facebook_v2();
		fb1.message();

	}

}
