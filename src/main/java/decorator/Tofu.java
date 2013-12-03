package decorator;

class Tofu implements IGericht {
	public void druckeBeschreibung() {
		System.out.print("Tofu");
	}

	public double getPreis() {
		return 8.50;
	}
}