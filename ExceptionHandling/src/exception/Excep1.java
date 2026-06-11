package exception;

public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i = 1/0;
		}
		
		catch(ArithmeticException e) {
			System.out.println("Handled...");
		}

	}

}
