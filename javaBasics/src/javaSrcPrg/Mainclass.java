package javaSrcPrg;

class Instagram_v1{
	void post() {
		System.out.println("Post photos and write comments");
	}
}

class Instagram_v2 extends Instagram_v1{
	void post() {
		super.post();
		System.out.println("Post photos, write comments, make videos and Reels");
	}
}

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instagram_v2 ir1 = new Instagram_v2();
		ir1.post();

	}

}
