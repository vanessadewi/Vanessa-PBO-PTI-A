import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new Supermarket();

        tambahkanPelanggan(supermarket, scanner);

        while (true) {
            System.out.println("\nPilih Transaksi:");
            System.out.println("1. Pembelian");
            System.out.println("2. Top Up");
            System.out.println("3. Keluar");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            if (pilihan == 1) {
                lakukanPembelian(supermarket, scanner);
            } else if (pilihan == 2) {
                lakukanTopUp(supermarket, scanner);
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan layanan kami.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void tambahkanPelanggan(Supermarket supermarket, Scanner scanner) {
        System.out.println("Selamat datang di Tiny Supermarket!");
        System.out.println("Silakan masukkan detail pelanggan.");

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nPelanggan " + i + ":");
            System.out.print("Nomor Akun: ");
            String nomorAkun = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Saldo: ");
            double saldo = scanner.nextDouble();
            System.out.print("Jenis Rekening (38/56/74): ");
            int jenisRekening = scanner.nextInt();
            System.out.print("PIN: ");
            int pin = scanner.nextInt();
            scanner.nextLine();

            Pelanggan pelanggan = new Pelanggan(nomorAkun, nama, saldo, jenisRekening, pin);
            supermarket.tambahPelanggan(pelanggan);
        }
    }

    private static void lakukanPembelian(Supermarket supermarket, Scanner scanner) {
        System.out.println("\nMasukkan Informasi Transaksi Pembelian:");
        System.out.print("Nomor Akun: ");
        String nomorAkun = scanner.next();
        scanner.nextLine(); 
        System.out.print("Jumlah Pembelian: ");
        double jumlah = scanner.nextDouble();
        System.out.print("PIN: ");
        int pin = scanner.nextInt();

        boolean sukses = supermarket.beli(nomorAkun, jumlah, pin);
        if (sukses) {
            System.out.println("Pembelian berhasil.");
        } else {
            System.out.println("Pembelian gagal.");
        }
    }

    private static void lakukanTopUp(Supermarket supermarket, Scanner scanner) {
        System.out.println("\nMasukkan Informasi Transaksi Top Up:");
        System.out.print("Nomor Akun: ");
        String nomorAkun = scanner.next();
        scanner.nextLine(); 
        System.out.print("Jumlah Top Up: ");
        double jumlah = scanner.nextDouble();
        System.out.print("PIN: ");
        int pin = scanner.nextInt();

        boolean sukses = supermarket.topUp(nomorAkun, jumlah, pin);
        if (sukses) {
            System.out.println("Top Up berhasil.");
        } else {
            System.out.println("Top Up gagal.");
        }
    }
}
