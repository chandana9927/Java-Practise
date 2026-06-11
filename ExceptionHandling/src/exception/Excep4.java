package exception;

public class Excep4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i = 18/2;
			try{
				int[] arr = {10, 20, 30, 40, 50, 60};
				//			  1   2	 3    4   5   6
				System.out.println(arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught");
			}
		}
		
		catch(ArithmeticException e) {
			System.out.println("handled");
		}
	}

}
