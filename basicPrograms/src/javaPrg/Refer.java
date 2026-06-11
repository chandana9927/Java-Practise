package javaPrg;

class Referred{
	
	int x = 348;
	static void disp(Referred r2) {
		System.out.println(r2.x);
	}
}

public class Refer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Referred r1 = new Referred();
		Referred.disp(r1);

	}

}
