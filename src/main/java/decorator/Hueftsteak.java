package decorator;

class Hueftsteak implements IGericht {
    public void druckeBeschreibung() {
        System.out.print("Hüftsteak");
    }
    public double getPreis() {
        return 13.0;
    }
} 