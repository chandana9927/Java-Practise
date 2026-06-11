package testfreshers;

public class D71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		int a = 9;
		demo(a);
		System.out.println("stop");
	}
	public static int demo(int a) {
		return a++;
	}

}
//a) start 9 stop
//b) start stop correct
//c)stop
//d)start 10 stop
