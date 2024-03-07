import java.util.Scanner;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan; 
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(double kmperjam) {
        kecepatan = rubahKecepatan(kmperjam); 
    }

    
    private double rubahKecepatan(double kmperjam) {
        return kmperjam * (1000.0 / 3600.0); 
    }

    public void setWaktu(double w) {
        waktu = w;
    }

    public double hitungJarak() {
        return kecepatan * waktu;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Serta memiliki warna " + warna);
        System.out.println("Dan mampu menempuh kecepatan " + kecepatan + " m/s");

        if (waktu > 0) {
            double jarakKm = hitungJarak() / 1000.0; 
            System.out.println("Dengan kecepatan ini, mobil dapat menempuh jarak " + jarakKm + " km.");
        }

        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MobilDisplaymessage m1 = new MobilDisplaymessage();
        m1.setManufaktur("Toyota");
        m1.setNoPlat("AB 1231 UA");
        m1.setWarna("Merah");

        System.out.println("Masukkan kecepatan mobil (dalam km/jam) untuk mobil m1: ");
        double kecepatanMobil = input.nextDouble();
        m1.setKecepatan(kecepatanMobil);

        System.out.println("Masukkan waktu perjalanan mobil (dalam jam) untuk mobil m1: ");
        double waktuPerjalanan = input.nextDouble();
        m1.setWaktu(waktuPerjalanan);

        System.out.println("Mobil pada objek m1 memiliki kecepatan " + kecepatanMobil + " km/jam dan akan menempuh waktu " + waktuPerjalanan + " jam.");
        System.out.println("================");

        m1.displayMessage();
    }
}
