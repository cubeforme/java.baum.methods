package baum_kompositum;
public abstract class baumelement {
    public abstract boolean suchen(datenelement wert);
    public abstract baumelement einfuegen(datenelement d);
    public abstract baumelement entfernen(datenelement d);
    public abstract baumelement anfuegenrechts(baumelement teilbaum);
}
