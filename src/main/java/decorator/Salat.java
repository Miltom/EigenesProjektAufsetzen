package decorator;

class Salat extends ABeilage {
    public Salat(IGericht pIGericht) {
        super(pIGericht);
    }
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.print(", Salat");
    }
    public double getPreis() {
        return gericht.getPreis() + 2.25;
    }
} 