package baum_kompositum;
public class abschluss extends baumelement{
    public abschluss(){
        super();
    }

    @Override
    public boolean suchen(datenelement wert) {
        return false;
    }

    @Override
    public baumelement einfuegen(datenelement d) {
        knoten k1 = new knoten(d, this, this);
        return k1;
    }

    @Override
    public baumelement entfernen(datenelement d) {
        return this;
    }

    @Override
    public baumelement anfuegenrechts(baumelement teilbaum) {
        return teilbaum;
    }
}
