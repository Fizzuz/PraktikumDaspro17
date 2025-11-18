package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2]; 
        int menu, baris, kolom;
        String nama;

        while (true) {
            System.out.println("\n--- Menu Bioskop ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            
            if (sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka menu.");
                sc.nextLine(); 
                continue;
            }

            switch (menu) {
                case 1:
                    System.out.println("\n--- Input Data Penonton ---");
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                  
                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] == null) { // Cek apakah kursi kosong
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil diinput.");
                        } else {
                            System.out.println("Kursi sudah terisi oleh: " + penonton[baris - 1][kolom - 1]);
                        }
                    } else {
                        System.out.println("❌ Nomor baris atau kolom tidak valid.");
                    }
                    break;
                
                case 2:
                    System.out.println("\n*** Daftar Penonton ***");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String status = (penonton[i][j] != null) ? penonton[i][j] : "***KOSONG***";
                            System.out.printf("Baris %d, Kolom %d: %s\n", (i + 1), (j + 1), status);
                        }
                    }
                    break;

                case 3:
                    // --- 🚪 Exit ---
                    System.out.println("Terima kasih, program selesai.");
                    sc.close();
                    return; 

                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}