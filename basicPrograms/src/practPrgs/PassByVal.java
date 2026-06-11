package practPrgs;

class Yeild{
	public static int add(int a, int b) {
		return a + b; 
	}
}

public class PassByVal {
	public static void main(String[] args) {

		int x = 45, y = 56;
		int s = Yeild.add( x , y );
		System.out.println(s);
	}

}
