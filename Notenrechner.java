import java.util.Scanner;

public class Notenrechner{
    public static void main(String[] args){
        double [] notenArry = notenEinlesen();
        notenAnzeigen(notenArry);
        double erg = berechneDurchschnitt(notenArry);
        System.out.println("Durchschnitt: "+erg);
    }
    public static double berechneDurchschnitt(double[] noten){
        int count=0;
        double alleNoten=0;
        for(int i = 0; i< noten.length;i++){
            alleNoten += noten[i];
            ++count;
        }
        return alleNoten/count;
    }
    public static void notenAnzeigen(double[] noten){
        for(int i = 0; i< noten.length;i++){
            System.out.println(noten[i]);
        }
    }
    private static double[] notenEinlesen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Anzahl Noten: ");
        int anzahl = sc.nextInt();
        double[] arr = new double[anzahl];
        //einlesen der variable anzahl schlägt fehl. keine ahnung wieso
        return arr;
    }
}