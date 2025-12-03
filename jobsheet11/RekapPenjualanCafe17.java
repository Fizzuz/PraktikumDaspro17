package jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe17 {

    
    static void inputPenjualan(int[][] penjualanMenu, String[] namaMenu) {
        for (int i = 0; i < penjualanMenu.length; i++) {
            System.out.println("Input penjualan untuk menu: " + namaMenu[i]);
            for (int hari = 0; hari < penjualanMenu[0].length; hari++) {
                System.out.print("  Hari ke-" + (hari + 1) + ": ");
                Scanner sc = new Scanner(System.in);
                penjualanMenu[i][hari] = sc.nextInt();
            }
        }
    }


    static void tampilkanTabel(int[][] penjualanMenu, String[] namaMenu) {
        System.out.println("\n=== TABEL PENJUALAN ===");
        for (int i = 0; i < penjualanMenu.length; i++) {
            System.out.print(namaMenu[i] + ": ");
            for (int hari = 0; hari < penjualanMenu[0].length; hari++) {
                System.out.print(penjualanMenu[i][hari] + " ");
            }
            System.out.println();
        }
    }

  
    static int hitungTotalPerMenu(int[] dataPenjualan) {
        int total = 0;
        for (int jumlah : dataPenjualan) {
            total += jumlah;
        }
        return total;
    }

   
    static void tampilkanMenuTertinggi(int[][] penjualanMenu, String[] namaMenu) {
        int totalTertinggi = -1;
        String menuTertinggi = "";

        for (int i = 0; i < penjualanMenu.length; i++) {
            int totalMenuIni = hitungTotalPerMenu(penjualanMenu[i]);
            if (totalMenuIni > totalTertinggi) {
                totalTertinggi = totalMenuIni;
                menuTertinggi = namaMenu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi:");
        System.out.println(menuTertinggi + " (Total: " + totalTertinggi + ")");
    }

    
    static void tampilkanRataRataPerMenu(int[][] penjualanMenu, String[] namaMenu) {
        System.out.println("\n=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < penjualanMenu.length; i++) {
            double rataRata = (double) hitungTotalPerMenu(penjualanMenu[i]) / penjualanMenu[0].length;
            System.out.println(namaMenu[i] + ": " + rataRata);
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = scanner.nextInt();
        scanner.nextLine(); 

       
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = scanner.nextInt();
        scanner.nextLine();

       
        String[] namaMenu = new String[jumlahMenu];
        System.out.println("\nMasukkan nama-nama menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            namaMenu[i] = scanner.nextLine();
        }

       
        int[][] penjualanMenu = new int[jumlahMenu][jumlahHari];

        RekapPenjualanCafe17 menghitung = new RekapPenjualanCafe17();

        
        inputPenjualan(penjualanMenu, namaMenu);
        tampilkanTabel(penjualanMenu, namaMenu);
        tampilkanMenuTertinggi(penjualanMenu, namaMenu);
        tampilkanRataRataPerMenu(penjualanMenu, namaMenu);

    }
}

