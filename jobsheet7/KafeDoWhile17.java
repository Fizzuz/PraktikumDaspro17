package jobsheet7;

import java.util.Scanner;
public class KafeDoWhile17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        long hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        
        do { 
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();

        long totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total harga yang harus dibayar: Rp " +totalHarga);
        sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    
}
}