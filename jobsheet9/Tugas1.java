package jobsheet9;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa yang ingin di input: ");
        int jumlahNilai = sc.nextInt();

        int [] daftarNilai = new int [jumlahNilai];
         
        double total = 0;
        int nilaiTerendah = Integer.MAX_VALUE, nilaiTertinggi = Integer.MIN_VALUE;

        System.out.println("Masukkan "+ jumlahNilai +" Nilai");

        for (int i = 0; i < jumlahNilai; i++){
            System.out.print("Masukkan nilai ke-" +(i+1)+" : ");
            int nilai = sc.nextInt();

            daftarNilai [i] = nilai;
            total += nilai; 

            if (nilai > nilaiTertinggi){
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah){
                nilaiTerendah = nilai;
            }
        

        }
        
        double rata2 = total/jumlahNilai;
        System.out.println("==== HASIL ANALISIS NILAI ====");
        System.out.println("Nilai rata-rata: " +rata2);
        System.out.println("Nilai terendah: "+ nilaiTerendah);
        System.out.println("Nilai tertinggi: "+ nilaiTertinggi);

        System.out.println("==== DAFTAR SEMUA NILAI ====");
        for (int i = 0; i < jumlahNilai; i++){
            System.out.println("Nilai ke-" +(i + 1)+ ": "+ daftarNilai[i]);
        }
    }
    
}
