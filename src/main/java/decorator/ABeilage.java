package decorator;

public abstract class ABeilage implements IGericht {
    protected IGericht gericht;

    public ABeilage(IGericht pIGericht) {
        gericht = pIGericht;
    }
}