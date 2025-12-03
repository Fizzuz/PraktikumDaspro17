package jobsheet11;
import java.util.Scanner;

public class NilaiMahasiswa17 {

   
    public static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }


    public static void tampilArray(int[] arr) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + arr[i]);
        }
    }

    
    public static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah mahasiswa: ");
        int mahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[mahasiswa];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);
        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);
    }
}

