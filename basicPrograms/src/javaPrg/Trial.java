package javaPrg;

 class Error{
	static void e() {
		System.out.println("This is Error class");
	}
}

 class TRY{
	static void t() {
		System.out.println("This is Try class");
	}
}
 
 class FINALLY{
	 static void f() {
		 System.out.println("This is Finally class");
	 }
 }
 
 class CATCH{
	 static void c() {
		 System.out.println("This is Catch class");
	 }
 }

public class Trial {
	public static void main(String[] args) {
		Error.e();
		TRY.t();
		FINALLY.f();
		CATCH.c();
	}

}
