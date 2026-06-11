package practPrgs;


public class P1 {
	int y = 36;
	int x = 456;
	int z = x * y;
	static void test(P1 pp2) {
		System.out.println(pp2.y);
		System.out.println(pp2.x);
		System.out.println(pp2.z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 pp1 = new P1();
		P1.test(pp1);

	}

}
