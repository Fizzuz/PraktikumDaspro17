package jobsheet10;

//Nama: Muhammad Hafiz
//NIM/Absen: 254107020056/17

public class Kuis17Hafiz {
    public static void main(String[] args) {

        int buku17 = 5;
        int hari17 = 3;
        double rataPendidikan17 = 0;
        int penjualan[][] = new int[buku17][hari17];
        penjualan [0][0] = 6;
        penjualan [0][1] = 9;
        penjualan [0][2] = 8;

        penjualan [1][0] = 5;
        penjualan [1][1] = 7;
        penjualan [1][2] = 6;

        penjualan [2][0] = 7;
        penjualan [2][1] = 8;
        penjualan [2][2] = 9;

        penjualan [3][0] = 4;
        penjualan [3][1] = 6;
        penjualan [3][2] = 7;

        penjualan [4][0] = 3;
        penjualan [4][1] = 5;
        penjualan [4][2] = 4;

        for (int i = 0; i < 1; i++){
            System.out.println("Banyaknya buku fiksi yang terjual pada hari senin, sabtu, minggu adalah: ");
           for (int j : penjualan[0]){
                System.out.println(j);
            }
        }
        for (int i = 0; i < 1; i++){
            System.out.println("Banyaknya buku Non-Fiksi yang terjual pada hari senin, sabtu, minggu adalah: ");
           for (int j : penjualan[1]){
                System.out.println(j);
            }
        }
        for (int i = 0; i < 1; i++){
            System.out.println("Banyaknya buku Pendidikan yang terjual pada hari senin, sabtu, minggu adalah: ");
            double rata17 = 0;
           for (int j : penjualan[2]){
                System.out.println(j);
                int total17 = 24;
                rata17 = total17 / 3;
                
            }
            System.out.println("Rata-rata buku pendidikan yang terjual: " +rata17);
            System.out.println();
            
        }
        for (int i = 0; i < 1; i++){
            System.out.println("Banyaknya buku Komik yang terjual pada hari senin, sabtu, minggu adalah: ");
           for (int j : penjualan[3]){
                System.out.println(j);
            }
        }
        for (int i = 0; i < 1; i++){
            System.out.println("Banyaknya buku Anak-Anak yang terjual pada hari senin, sabtu, minggu adalah: ");
           for (int j : penjualan[4]){
                System.out.println(j);
            }
        }
        long harga17 = 50000;
        long hargaPKA17 = 35000;
        System.out.println("===========================");
        System.out.println("Harga buku fiksi dan non-fiksi: " + harga17);
        System.out.println("Harga buku pendidikan, komik, dan anak-anak: " +hargaPKA17);
        int pemasukan17 = 0;
        for (int i = 0; i < buku17; i++){
            for(int j = 0; j < hari17; j++){
                
                pemasukan17 += penjualan[i][j];
            }
            
        }
        int totalHarga17 = (int) ((harga17 + hargaPKA17) * pemasukan17);
    System.out.println("Total pemasukan selama 3 hari adalah: " +totalHarga17);
    }
}
