import java.util.LinkedList;

public class LList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Vinod");
		l1.add("Ebiz Solutions");
		l1.add("Test Engineer");
		System.out.println("Linked List Items" + " " + l1);
		l1.addFirst("Mr.");
		l1.addLast("5 Yrs Exp");
		System.out.println("Linked List Items After Adding" + " " + l1);
		Object firstvar = l1.get(0);
		System.out.println("First Element" + " " + firstvar);
		l1.set(0, "Update First Element");
		Object secondvar = l1.get(0);
		System.out.println("After updating First Element" + " " + secondvar );
		l1.removeFirst();
		l1.removeLast();
		System.out.println("After deleting elements" + " " +  l1);

	}

}
