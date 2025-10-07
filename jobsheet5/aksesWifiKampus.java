import java.util.Scanner;
public class aksesWifiKampus {
    public static void main(String[] args) {
        int sks;
        String role;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan role: ");
        role = sc.nextLine();
        

        if (role.equalsIgnoreCase("dosen")){
            System.out.println("Akses Wifi diberikan");
        }
        else if (role.equalsIgnoreCase("mahasiswa")){
            System.out.print("Masukkan jumlah SKS: ");
        sks = sc.nextInt();
            if (sks >= 12){
                System.out.println("Akses WIFI diberikan");
            }
            else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
            
        } 
        else {
            System.out.println("Akses Ditolak");
        }



      }
        
        
    }

