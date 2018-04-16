
public class Palindrome {
	
	public static void main(String args[]) {
		int num=444;
		int r,sum=0;
		int temp;
		temp = num;
		while (num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			}
		if(sum==temp) {
			System.out.println("palindrome number");
		}else {
			System.out.println("Not palindrome number");
		}
	}
	
	
	

}
