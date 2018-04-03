
public class Overloading {
	
	public void disp(String c) {
		System.out.println(c);
	}
	
	public void disp(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading ol = new Overloading();
		ol.disp("Vinod");
		ol.disp(11, 12);
		

	}

}
