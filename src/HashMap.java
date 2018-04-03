import java.util.Map;

public class HashMap {
	
	public static void main(String[]args){
		String sb1 = new String("sb");
		Map m = (Map) new HashMap();
		m.put(sb1,"value1");
		sb1 = sb1.concat("f");
		System.out.println(m.get("sb"));
		System.out.println(m.get("sbf"));

		
	}

}
