import java.util.Scanner;

public class Main {
    public static void main(String[] args) {      
        Perpustakaan perpus = new Perpustakaan(); 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama : Vanessa Dewi Agustina");
        System.out.println("Kelas: PTI-A");
        System.out.println("NIM  : 235150601111005");
        System.out.println("Selamat datang di perpustakaan");
        System.out.println("Pilihan buku: \n1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi");
        System.out.print("Silahkan pilih buku ");
        int pilihanMenu = input.nextInt(); 
        input.nextLine();
        perpus.tampilkanSesuaiKategori(pilihanMenu);
    }
}
