package practisePrg;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 50;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		a = b + a;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
		

	}

}
