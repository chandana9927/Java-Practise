package exception;

public class ThrowThrows {
	static void disp3() {//throws
		int i = 1/0;//throw
	}
	static void disp2() {//throws
		disp3();//throw
	}
	static void disp1() {//throws
		disp2();//throw
	}
/*catch block addresses the exception, the throw function is virtually 
 * present, this function creates the (AE e) new AE("/0");(object) and 
 * it gets invoked only when an exception occurs.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		disp1();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
		
		

	}

}
