package jobsheet8;

import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        
Scanner sc = new Scanner (System.in);

System.out.print("Masukkan nilai n: ");
int n = sc.nextInt();

if (n<3){
    System.out.println("Input tidak valid, nilai minimal adalah 3");
}
else{
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print(n + " ");
            }
            else {
                System.out.print("  ");
            }

    }
    System.out.println("");
}

    }
        
}
}
