/* Author: Remo */
public class Main{
  public static void main(String[] args){
    System.out.println("This program is about Fahrzeuge");
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
  