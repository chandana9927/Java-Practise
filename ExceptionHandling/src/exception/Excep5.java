package exception;

public class Excep5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i = 1/0;
		}
		catch(ArithmeticException e) {
			System.out.println("HAndled");
			int[] arr = {10,20,30,40,50,60};
			try{
				System.out.println(arr[9]);
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println("caught");
			}
			
		}

	}

}
