package baum_kompositum;
public class bluemchen {
    private baumelement wurzel;
    
    public bluemchen(){
        wurzel=new abschluss();
    }
    
    public boolean suchen(datenelement wert){
        return wurzel.suchen(wert);
    }
    
    public void einfuegen(datenelement d){
            wurzel=wurzel.einfuegen(d);
    }
    
    public void entfernen(datenelement d){
        wurzel=wurzel.entfernen(d);
    }
}
