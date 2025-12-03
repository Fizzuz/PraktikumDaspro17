package jobsheet11;
import java.util.Scanner;

public class Kubus17 {

    
    public double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    
    public double hitungLuasPermukaan(double s) {
        return 6 * (s * s);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Kubus17 kubus = new Kubus17();
        
       
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        double v = kubus.hitungVolume(sisi);
        double lp = kubus.hitungLuasPermukaan(sisi);

        System.out.println("Volume         : " + v);
        System.out.println("Luas Permukaan : " + lp);
    }
}

