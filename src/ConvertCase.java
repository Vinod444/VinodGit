
public class ConvertCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet = "ViNOdSV";
		StringBuilder sb = new StringBuilder(alphabet);
		for (int index = 0; index < sb.length(); index++) {
			char c = sb.charAt(index);
			if (Character.isLowerCase(c)) {
				sb.setCharAt(index, Character.toUpperCase(c));
			}else {
				sb.setCharAt(index, Character.toLowerCase(c));
			}
			 
		}
		System.out.println(sb);
	}

}
