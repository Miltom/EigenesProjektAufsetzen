package decorator;

class Pommes extends ABeilage {
    public Pommes(IGericht pIGericht) {
        super(pIGericht);
    }
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.print(", Pommes");
    }
    public double getPreis() {
        return gericht.getPreis() + 2.50;
    }
} 