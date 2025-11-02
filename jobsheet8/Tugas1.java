package jobsheet8;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        int kuadrat, batas = 5;

        for (int n=1; n<=batas; n++){
            System.out.print(" n = " + n + " Jumlah kuadrat = ");
        
        int jumlah = 0;
        for (int i = 1; i<=n; i++){
            kuadrat = i*i;
            jumlah += kuadrat;
            System.out.print(kuadrat);
            if (i<n){
                System.out.print(" + ");
            }
          
        }
        if (n>1){
            System.out.print(" = ");
            System.out.print(jumlah);
        }
        System.out.println("");
        
    }
   
    }
}
