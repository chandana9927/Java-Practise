package programming;

public class Cal_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 78;
		int b = 36;
		char ch = '*';
		switch(ch) {
		case '+' : System.out.println("Addition");
		           int c = a + b;
		           System.out.println(c);
		           break;
		case '-' : System.out.println("Subtraction");
                   int d = a - b;
                   System.out.println(d);
                   break;
		case '*' : System.out.println("Multiplication");
                   int e = a * b;
                   System.out.println(e);
                   break;           
		case '/' : System.out.println("Division");
                   int f = a + b;
                   System.out.println(f);
                   break;
        default:   System.out.println("Invalid operation");
		}

	}

}
