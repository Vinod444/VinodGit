
public class MissingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,5,6};
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i+1!=a[j]) {
					System.out.println(i);
				}
			}
			
		}

	}

}
