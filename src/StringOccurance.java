import java.util.HashMap;

public class StringOccurance {

	public static void main(String[] args) {
		String str = "aabbccadc";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				System.out.println(val);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
		
}		
	// TODO Auto-generated method stub
		/* String occurance = "aabbccadc";
		char[] convert=occurance.toCharArray();
		for (int i = 0; i < convert.length; i++) {
			for (int j = 1; j < convert.length; j++) {
				
				if (convert[i]==convert[j]) {
					//System.out.println(2*convert[i]);
					System.out.println("Matched" + " " + convert[i] + " " + convert[j]);
				}
			}
			
		}*/
	




