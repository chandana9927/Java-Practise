package practPrgs;

public class ArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[3];
		ar1[0] = 132;
		ar1[1] = 432;
		ar1[2] = 352;
		for(int i = 0; i< ar1.length; i++) {
			for(int j = i; j < ar1.length;j++) {
				if(ar1[i] > ar1[j]) {
					int temp = ar1[i];
					ar1[i] = ar1[j];
					ar1[j] = temp;
				}
			}
			System.out.println(ar1[i]);
		}
		int[] ar2 = {12, 35, 53, 36};
		for(int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
		}
		
		

	}

}
