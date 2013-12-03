package decorator;

class Suppe extends ABeilage {
    public Suppe(IGericht pIGericht) {
        super(pIGericht);
    }
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.print(", Suppe");
    }
    public double getPreis() {
        return gericht.getPreis() + 1.50;
    }
} 