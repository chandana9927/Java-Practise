package arrays;
//1st biggest and second biggest elements in an array.
public class Arr9 {

	public static void main(String[] args) {
		int [] arr = {40, 20, 10, 30, 50};
		int fBig = arr[0];
		int sBig = arr[1];
		for(int i = 0; i < arr.length; i++) {
			if(fBig <= arr[i]) {
				sBig = fBig;
				fBig = arr[i];
			}
			else if(sBig < arr[i]) {
				sBig = arr[i];
			}
		}
		System.out.println(fBig+" "+sBig);
	}

}
