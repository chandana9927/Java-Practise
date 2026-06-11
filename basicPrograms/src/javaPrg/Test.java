package javaPrg;

class Area{
	static int rect(int a , int b ) {
		int area = a * b;
		return area;
	}
}
public class Test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Area.rect(12, 35);
		System.out.println("Area Rect:" +x);

	}

}
