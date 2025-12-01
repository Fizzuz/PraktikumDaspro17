package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();

        
        int[] nilaiMhs = new int[jmlMahasiswa];
        
        double total = 0;
        double rata2;
        int jmlLulus = 0; 

       
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jmlLulus++; 
            }
        }
        
        
        if (nilaiMhs.length > 0) {
            rata2 = total / nilaiMhs.length;
            System.out.println("Rata-rata nilai = " + rata2);
            System.out.println("Jumlah mahasiswa yang lulus = " + jmlLulus);
        } else {
            System.out.println("Tidak ada data nilai yang dimasukkan.");
        }
    }
}