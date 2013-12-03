package decorator;

class Nudeln extends ABeilage {
    public Nudeln(IGericht pIGericht) {
        super(pIGericht);
    }
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.print(", Nudeln");
    }
    public double getPreis() {
        return gericht.getPreis() + 4.50;
    }
} 