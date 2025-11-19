package jobsheet10;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int responden = 5;
        int pertanyaan = 3;
        int[][] hasilSurvei = new int[responden][pertanyaan];

        System.out.println("========= Input Hasil Survei (1-5) ============");
        for (int i = 0; i < responden; i++){
            System.out.println("Responden ke-" + (i+1));
            for (int j = 0; j < pertanyaan; j++){
                System.out.print("Pertanyaan " + (j+1) + ": ");
                hasilSurvei [i][j] = sc.nextInt();
            }
        }

        double totalNilai = 0;

        System.out.println("========== Rata-Rata Nilai per Responden ==========");

        for (int i = 0; i < responden; i++){
            double totalNilaiResponden = 0;
            for (int j = 0; j < pertanyaan; j++){
                totalNilaiResponden += hasilSurvei[i][j];
            }
            double rataResponden = totalNilaiResponden / pertanyaan;
            System.out.println("Responden ke-" + (i+1) +": "+ rataResponden);

            totalNilai += totalNilaiResponden;
        }

        System.out.println("=========== Rata-Rata Nilai per Pertanyaan =============");

        for (int i = 0; i < responden; i++){
            double totalNilaiPertanyaan = 0;
            for (int j = 0; j < pertanyaan; j++){
                totalNilaiPertanyaan += hasilSurvei[i][j];
            }
            int totalData = responden * pertanyaan;
            double rataPertanyaan = totalNilaiPertanyaan / responden;

            System.out.println("Responden ke-" + (i+1) +": " + rataPertanyaan);
        }
        
        int totalData = responden * pertanyaan;
        double rataTotal = totalNilai / totalData;

        System.out.println("========= Rata-Rata Keseluruhan ==========");
        System.out.println("Rata-rata Keseluruhan: " + rataTotal);


    }
    
}
