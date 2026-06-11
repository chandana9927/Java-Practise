package Random;

public class Threadssssssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 =  Thread.currentThread();
		Thread th2 = th1;
		System.out.println(th2.getId());
		System.out.println(th2.getName());
		System.out.println(th2.getPriority());
		th2.setName("ABC");
		th2.setPriority(9);
		System.out.println(th2.getId());
		System.out.println(th2.getName());
		System.out.println(th2.getPriority());

	}

}
