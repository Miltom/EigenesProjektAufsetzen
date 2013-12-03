package decorator;

class Bratkartoffeln extends ABeilage {
    public Bratkartoffeln(IGericht pIGericht) {
        super(pIGericht);
    }
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.print(", Bratkartoffeln");
    }
    public double getPreis() {
        return gericht.getPreis() + 1.50;
    }
}  