package javaSrcPrg;

class Youtube_v1{
	void video() {
		System.out.println("Upload videos, comments, like, dislike, subscribe");
	}
}

class Youtube_v2 extends Youtube_v1{
	void video() {
		super.video();
		System.out.println("Upload videos, comments, like, dislike, subscribe, shorts");
	}
}

public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Youtube_v2 yt1 = new Youtube_v2();
		yt1.video();

	}

}
