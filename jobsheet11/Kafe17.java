package jobsheet11;
import java.util.Scanner;
public class Kafe17 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, " +namaPelanggan + "!");
        
        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        System.out.println("==== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===================================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga17(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        

        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String lanjut;
        System.out.print("Masukkan nama Pelanggan: ");
        String nama = sc.nextLine();

        Menu(nama,false);
        
        do{
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int hargaItemSementara = hitungTotalHarga17(pilihanMenu, banyakItem);
        totalKeseluruhan += hargaItemSementara;
        System.out.println("Harga item ini: Rp "+hargaItemSementara);
        System.out.println("Apakah Anda ingin memesan menu lain? (y/t)");
        lanjut = sc.next();
        sc.nextLine();
        }while (lanjut.equalsIgnoreCase("y"));
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();
        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Selamat! Anda mendapatkan diskon 50%");
            totalKeseluruhan = (int) (totalKeseluruhan * 0.5);
        }
        else if (kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Selamat! Anda mendapatkan diskon 30%");
            totalKeseluruhan = (int) (totalKeseluruhan * 0.3);
        }
        else {
            System.out.println("Kode tidak valid!");
        }
       
        System.out.println("Total keseluruhan pesanan Anda: Rp " + totalKeseluruhan);

    }


}
