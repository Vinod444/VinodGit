
public class OverridingIcici extends OverridingAxis {
	int getRateOfInterest() {
		return 3;
	}

	
		public static void main(String args[]){  
			OverridingSbi osbi = new OverridingSbi();
			OverridingAxis oax = new OverridingAxis();
			OverridingIcici oicici = new OverridingIcici();
			System.out.println(osbi.getRateOfInterest());
			System.out.println(oax.getRateOfInterest());
			System.out.println(oicici.getRateOfInterest());
			
		}
	

}

