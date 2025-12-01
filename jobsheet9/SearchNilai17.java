package jobsheet9;
import java.util.Scanner;

public class SearchNilai17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Masukkan banyaknya elemen array: ");
        int jmlElemen = sc.nextInt();

        
        int[] arrNilai = new int[jmlElemen];

        
        System.out.println("Masukkan " + jmlElemen + " elemen array:");
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
              
        System.out.print("\nMasukkan nilai (key) yang ingin dicari: ");
        int key = sc.nextInt();     
        int hasil = 0; 
        
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; 
                break;     
            }
        }

       
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
        }
        System.out.println();
    }
}