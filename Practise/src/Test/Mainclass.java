package Test;
class Amazon 
{
	void product()
	{
		System.out.println("Laptop");
	}
}

class Ekart
{
	static void order(Amazon a2)
		{
		    a2.product();
	    }
}

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{	
			Amazon a1 = new Amazon();
			Ekart.order(a1);
		}

	}

}
