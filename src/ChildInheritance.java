
public class ChildInheritance extends Inheritance {
	
	   public void multiplication(int x, int y){
		   z=x*y;
		   System.out.println("The multiply of the given numbers:"+z);
	   }
	   
	   public static void main(String[]args){
		   ChildInheritance ci = new ChildInheritance();
		   ci.addition(5, 6);
		   ci.subtraction(6, 7);
		   ci.multiplication(7, 8);
		   
	   }

}
