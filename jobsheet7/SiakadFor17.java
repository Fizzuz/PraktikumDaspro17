package jobsheet7;

import java.util.Scanner;
public class SiakadFor17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double nilai = 0, tertinggi = 0, terendah = 100 ;
        int i = 1, lulus = 0, tidakLulus = 0;
        for (i = 1; i <=10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai > 60){
                lulus++;
            }
            else {
                tidakLulus++;
            }
        }
        
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " +terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
        }
    }

