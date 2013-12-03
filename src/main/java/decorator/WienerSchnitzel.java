package decorator;

class WienerSchnitzel implements IGericht {
	public void druckeBeschreibung() {
		System.out.print("WienerSchnitzel");
	}

	public double getPreis() {
		return 10.50;
	}
}