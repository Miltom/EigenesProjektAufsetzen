package decorator;

class Garnelen implements IGericht {
	public void druckeBeschreibung() {
		System.out.print("Garnelen");
	}

	public double getPreis() {
		return 13.50;
	}

}