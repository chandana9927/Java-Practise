package javaPrg;

public class Sample {
	public static void send(String txt) {
		System.out.println("THIS IS A MESSAGE");
	}
	
	public static void send(int no) {
		System.out.println("THIS IS A NUMBER");
	}
	public static void send(String txt, int no) {
		System.out.println("THIS IS A MESSAGE AND A NUMBER");
	}
	public static void main(String[] args) {
		send("hello");
		send(2234);
		send("Bye", 1232);
		
	}

}
