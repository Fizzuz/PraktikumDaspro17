package jobsheet6;

import java.util.Scanner;

public class caseMethod1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama;
        int nim;
        int matkul;
        double nilaiAkhir;
        
        
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama  : ");
        nama = sc.nextLine(); 
        System.out.print("NIM   : ");
        nim = sc.nextInt();

        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS     : ");
        int uts1 = sc.nextInt();
        System.out.print("Nilai UAS     : ");
        int uas1 = sc.nextInt();
        System.out.print("Nilai Tugas   : ");
        int tugas1 = sc.nextInt();

        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS     : ");
        int uts2 = sc.nextInt();
        System.out.print("Nilai UAS     : ");
        int uas2 = sc.nextInt();
        System.out.print("Nilai Tugas   : ");
        int tugas2 = sc.nextInt();
            
            nilaiAkhir = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3); 

        if (uts1>=60 || uas1>=60 || tugas1 >=60 )

       // System.out.println("================ HASIL PENILAIAN AKADEMIK =============");
       // System.out.println("Nama    : " +nama);
        //System.out.println("NIM     : " +nim);
       // System.out.println("");
       // System.out.println("Mata Kuliah\t\t\t\t\tUTS\tUAS\tTugas\tNilai Akhir\t Nilai huruf");
       // System.out.println("-------------------------------------------------------------------------");
      //  System.out.println("Algoritma Pemrograman \t\t\t\t\t%d\t%d\t%d\t%d\t%c",uts1, uas1,tugas1,nilaiAkhir,nilaiHuruf);
     }
}
