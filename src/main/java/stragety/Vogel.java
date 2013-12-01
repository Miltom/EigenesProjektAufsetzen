package stragety;

public class Vogel implements Tierverhalten {

	public void fressen() {
		System.out.println("Würmer, Körner");
	}

	public void lauteGeben() {
		System.out.println("Zirp, zierp");
	}

	public void bewegen() {
		System.out.println("Fliegen, Hüpfen, Laufen");
	}

}
