package practPrgs;

class A{
	int x = 46;
	static void abc(A a2) {
		System.out.println(a2.x);
	}
}

class B{
	int y = 354;
	static void bac(B b2) {
		System.out.println(b2.y);
	}
}

public class Trial {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		A.abc(a1);
		B.bac(b1);
	}

}
