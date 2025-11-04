package jobsheet8;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pesanan = 0;
        int pelanggan = 0,  totalItemKeseluruhan = 0;
        int totalPelangganKeseluruhan = 0;
        System.out.print("Masukkan jumlah cabang kafe: ");
        int kafe = sc.nextInt();

        System.out.println("=== Input Jualan Per Cabang ===");

        for(int i = 1; i <= kafe; i++){
            System.out.println("--- Cabang " + i +" ---");
            System.out.print("Jumlah pelanggan: ");
            pelanggan = sc.nextInt();
            int totalItem = 0;
            for (int j = 1; j <= pelanggan; j++){
                System.out.print("- Pelanggan " + j +" Memesan berapa item? ");
                pesanan = sc.nextInt();
                totalItem += pesanan;

            }
            
            System.out.println("Cabang " + i +" :");
            System.out.println("- Pelanggan: " + pelanggan + " Orang");
            System.out.println("- Item terjual: " + totalItem);
            totalItemKeseluruhan += totalItem;
            totalPelangganKeseluruhan += pelanggan;
        }
        

        System.out.println("");
        System.out.println("Total seluruh Cabang: ");
        
        System.out.println("Pelanggan: "+ totalPelangganKeseluruhan +" Orang");
        System.out.println("Total item terjual: " + totalItemKeseluruhan + " Item");

    }
}
