import java.util.Scanner;

public class MainMobil {

public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
        Mobil m1 = new Mobil();
        System.out.print("Masukkan kecepatan mobil anda\t:");
        int kecepatan = input.nextInt();
        input.nextLine();
        m1.setKecepatan(kecepatan);

        System.out.print("Masukkan manufaktur mobil anda\t:");
        String manufaktur = input.nextLine();
        m1.setManufaktur(manufaktur);

        System.out.print("Masukkan plat nomor mobil anda\t:");
        String noplat = input.nextLine();
        m1.setNoPlat(noplat);

        System.out.print("Masukkan warna mobil anda\t:");
        String warna = input.nextLine();
        m1.setWarna(warna);
        m1.displayMessage();

        System.out.println("================");
   
    Mobil m2 = new Mobil();
    System.out.print("Masukkan kecepatan mobil anda\t:");
    int kecepatan2 = input.nextInt();
    input.nextLine();
    m2.setKecepatan(kecepatan2);
    System.out.print("Masukkan manufaktur mobil anda\t:");
    String manufaktur2 = input.nextLine();
    m2.setManufaktur(manufaktur2);
    System.out.print("Masukkan plat nomor mobil anda\t:");
    String noplat2 = input.nextLine();
    m2.setNoPlat(noplat2);
    System.out.print("Masukkan warna mobil anda\t:");
    String warna2 = input.nextLine();
    m2.setWarna(warna2);
    m2.displayMessage();
    System.out.println("================");
    
    System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
    m1.setWarna("Hijau");
    
    m1.displayMessage();
    }
}
