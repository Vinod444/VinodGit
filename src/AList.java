import java.util.ArrayList;

public class AList {
	
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Vinod");
		a1.add("Test Engineer");
		a1.add("Ebiz Solutions");
		System.out.println("Before Adding String" + " " +a1);
		a1.add(2,"5 Yrs Exp");
		System.out.println("After Adding String" + " " +a1);
		a1.remove(2);
		System.out.println("After removing String" + " " +a1);
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Manual Testing");
		a2.add("Automation Testing");
		a2.add("Performance Testing");
		a1.addAll(a2);
		System.out.println("Arraylist 1 after adding all" + " " + a1);
	}

}
