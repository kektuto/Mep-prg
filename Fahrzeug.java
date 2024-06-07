/* Author: Remo */
public class Fahrzeug {
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
public class Harrad extends Fahrzeug{
  
}
  