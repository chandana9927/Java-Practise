package javaSrcPrg;

class A{
	void methA() {
		System.out.println("Hello I am Method A");
	}
}

class B extends A{
	
	static void k() {
		System.out.println("This is K");
	}
	
	void methA() {
		System.out.println("I can execute Method of class A and Method of class B");
		A a1 = new A();
		a1.methA();
		k();
	}
}

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.methA();
	}

}
