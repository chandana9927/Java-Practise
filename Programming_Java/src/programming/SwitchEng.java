package programming;

public class SwitchEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		switch (n) {
		case 1 : rsa();
		        break;
		case 2 : england();
			    break;
		case 3: newZealand();
			    break;
		case 4 : india();
				break;
		case 5 : australia();
				break;
		default:
			System.out.println("Unexpected value: " + n);
		}

	}
	public static void india()
	{
		String player1 = "Shubhman Gill", player2 = "Rohit Sharma";
		System.out.println("Indian Players: " + player1 + " and " + player2);
	}
	public static void rsa()
	{
		String player1 = "David Miller", player2 = "Heinrich Klaasen";
		System.out.println("South African Players: " + player1 + " and " + player2);
	}
	public static void england() 
	{
		String player1 = "Joss Buttler", player2 = "Joe Root";
		System.out.println("England Players: " + player1 + " and " +player2);
	}
	public static void australia()
	{
		String player1 = "Glenn Maxwell", player2 = "David Warner";
		System.out.println("Australian players: " + player1 + " and " + player2);
	}
	public static void newZealand()
	{
		String player1 = "Kane Williamson", player2 = "Tom Latham";
		System.out.println("New Zealand players: " + player1 + " and " + player2);
	}

}
