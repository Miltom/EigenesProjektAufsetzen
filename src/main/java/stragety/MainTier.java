package stragety;

public class MainTier {

	public static void main(String[] args) {
		tierTest(new Katze());
		System.out.println("\n\n");
		tierTest(new Vogel());
		System.out.println("\n\n");
		tierTest(new Biene());
		System.out.println("\n\n");
		tierTest(new Fisch());
		
	}
	
	
	public static void tierTest(Tierverhalten tier){
		tier.lauteGeben();
		tier.fressen();
		tier.bewegen();
	}
}
