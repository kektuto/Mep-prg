/* Author: Remo */

public class Main{
  public static void main(String[] args){

    Hund Fido = new Hund("hotdog");
    Katze Frisky = new Katze("Grauvieh");
    Frisky.melden("Miau Miau");
    System.out.println("Name: "+Frisky.name);
    Fido.melden("Wuuf Wuuf");
    System.out.println("Name: "+Fido.name);

    /* 
    Tisch meinTisch = new Tisch(5, 2,3);
    System.out.println("Fläche: "+meinTisch.flache());
    */

    /*
    System.out.println("\nThis program is about Fahrzeuge");
    Fahrzeug Traktor = new Fahrzeug();
    Traktor.setFahrzeugNummer(55);
    Traktor.setLeerGewicht(0);

    PersonenWagen Remos = new PersonenWagen();
    Remos.setLeerGewicht(100);
    Remos.setFahrzeugNummer(66);
    Remos.setLeistung(600);

    System.out.println("Fahrzeugnummer: "+Traktor.getFahrzeugNummer()+"\n");
    System.out.println("Fahrzeugnummer: "+Remos.getFahrzeugNummer()+" PS: "+Remos.getLeistung()+"\n");
    */
  }
}
class Fahrzeug {
    /* public static void main(String[] args) {
      System.out.println("Hello World");
    } */
    private double nummer;
    private double leerGewicht;

    public void setFahrzeugNummer(double setNummer){
      this.nummer = setNummer;
    }
    public void setLeerGewicht(double gewicht){
      this.leerGewicht = gewicht;
    }
    public double getFahrzeugNummer(){return nummer;}
    public double getLeerGewicht(){return leerGewicht;}
  }
class Fahrrad extends Fahrzeug{
  private float ramenHoehe;
  public void setRamenHoehe(float ramen){
    this.ramenHoehe = ramen;
  }
  public float getRamenHoehe(){return ramenHoehe;}
}
class KraftFahrzeug extends Fahrrad{
  private int leistung;
  public void setLeistung(int ps){
    this.leistung = ps;
  }
  public float getLeistung(){return leistung;}
}
class PersonenWagen extends KraftFahrzeug{
  private int anzahlPlaetze;
  public void setAnzahlPlaetze(int plaetze){
  this.anzahlPlaetze = plaetze;
  }
  public int getAnzahlPlaetze(){return anzahlPlaetze;}
}
