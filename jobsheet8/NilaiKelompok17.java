package jobsheet8;
import java.util.Scanner;
public class NilaiKelompok17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    float totalNilai, rataNilai, rataTertinggi = 0;
    int nilai, i = 1, kelompokPemenang = 0;
    
while (i <= 6){
    System.out.println("Kelompok " +i);

    totalNilai = 0;
    for (int j = 1; j <= 5; j++){
        System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
        nilai = sc.nextInt();
        totalNilai += nilai;
    }
    rataNilai = totalNilai / 5;
    System.out.println("Kelompok " + i + " : nilai rata-rata = " +rataNilai);
    if (rataNilai > rataTertinggi){
        rataTertinggi = rataNilai;
        kelompokPemenang = i;
    }
    i++;
        }
        System.out.println("Kelompok dengan rata-rata tertinggi adalah: Kelompok " + kelompokPemenang);
        System.out.println("Dengan nilai rata-rata: " + rataTertinggi);
    }
}
