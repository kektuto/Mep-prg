
public class Tisch {
    int laenge, breite, hoehe;
    public Tisch(int laenge, int breite, int hoehe){
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }
    public void setLaenge(int vLaenge){
        laenge = vLaenge;
    }
    public void getLaenge(){
        System.out.println(laenge);
    }
    public int flache(){
        return laenge * breite * hoehe;
    }
}