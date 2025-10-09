package jobsheet6;

import java.util.Scanner;

public class CM1_MuhammadHafiz {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama;
        long nim;
        double nilaiAkhir1, nilaiAkhir2;
        
        
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
            
            nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3); 
            nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

            String nilaiHuruf1;
            String status;
            String nilaiHuruf2, status2;

            if(nilaiAkhir1 >=81 && nilaiAkhir1<=100 ){
                nilaiHuruf1 = "A";
            }
            else if(nilaiAkhir1 >= 74 && nilaiAkhir1 <=80){
                nilaiHuruf1 = "B+";
            }
            else if(nilaiAkhir1 >= 66 && nilaiAkhir1 <=73){
                nilaiHuruf1 = "B";
            }
            else if(nilaiAkhir1 >= 61 && nilaiAkhir1 <=65){
                nilaiHuruf1 = "C+";
            }
            else if(nilaiAkhir1 >= 51 && nilaiAkhir1 <=60){
                nilaiHuruf1 = "C";
            }
            else if(nilaiAkhir1 >= 39 && nilaiAkhir1 <=50){
                nilaiHuruf1 = "D";
            }
            else {
                nilaiHuruf1 = "E";
            }
            if (nilaiAkhir1 >=60){
                status = "LULUS";
            }
            else {
                status = "TIDAK LULUS";
            }

         if(nilaiAkhir2 >=81 && nilaiAkhir2<=100 ){
                nilaiHuruf2 = "A";
            }
            else if(nilaiAkhir2 >= 74 && nilaiAkhir2 <=80){
                nilaiHuruf2 = "B+";
            }
            else if(nilaiAkhir2 >= 66 && nilaiAkhir2 <=73){
                nilaiHuruf2 = "B";
            }
            else if(nilaiAkhir2 >= 61 && nilaiAkhir2 <=65){
                nilaiHuruf2 = "C+";
            }
            else if(nilaiAkhir2 >= 51 && nilaiAkhir2 <=60){
                nilaiHuruf2 = "C";
            }
            else if(nilaiAkhir2 >= 39 && nilaiAkhir2 <=50){
                nilaiHuruf2 = "D";
            }
            else {
                nilaiHuruf2 = "E";
            }
            
            if (nilaiAkhir2 >=60){
                status2 = "LULUS";
            }
            else {
                status2 ="TIDAK LULUS";
            }

            double rata_rata = (nilaiAkhir1 + nilaiAkhir2) / 2;
            String semester;

            if (status2.equals("LULUS") && status2.equals("LULUS")){
                semester = "LULUS";
            }
            else {
                semester = "TIDAK LULUS";
            }
            if (rata_rata >=70){
                semester = "LULUS";
            }
            else {
                semester = "TIDAK LULUS";
            }

        System.out.println("================ HASIL PENILAIAN AKADEMIK =============");
        System.out.printf("Nama    :%s\n ", nama );
        System.out.println("NIM     : " +nim);
        System.out.println("");
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai huruf\tSTATUS");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t" +uts1 +" \t" +uas1+" \t" +tugas1+" \t "+nilaiAkhir1+" \t\t\t" +nilaiHuruf1 +"\t"+status);
        System.out.println("Struktur Data\t\t" +uts2 +" \t" +uas2+" \t" +tugas2+" \t "+nilaiAkhir2+" \t\t\t" +nilaiHuruf2+"\t"+status2);
        System.out.println("");
        System.out.println("Rata-rata Nilai Akhir\t:" +rata_rata);
        System.out.println("Status Semester\t\t:" +semester);
     }
     }  

