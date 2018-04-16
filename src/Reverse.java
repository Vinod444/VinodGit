
public class Reverse {
	

	public static void main(String[] args) {
		 String name = "vinod";
		 char[] change = name.toCharArray();
		 int left, right=0;
	        right = change.length-1;
	        for (left=0; left < right ; left++ ,right--)
	        {
	            // Swap values of left and right
	            char temp = change[left];
	            change[left] = change[right];
	            change[right]=temp;
	        }
	        System.out.println(change);
	    }
	
		
		// TODO Auto-generated method stub

	}


