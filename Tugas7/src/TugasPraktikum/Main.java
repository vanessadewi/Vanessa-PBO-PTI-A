import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kue[] daftarKue = new Kue[20]; 

        daftarKue[0] = new KuePesanan("Kue Soklat", 10.000, 2.5);
        daftarKue[1] = new KuePesanan("Kue Stroberi", 15.000, 3.0);
        daftarKue[2] = new KueJadi("Kue Matcha", 20.000, 5);
        daftarKue[3] = new KueJadi("Kue Keju", 25.000, 3);
        daftarKue[4] = new KueBasi("Kue Kacang", 17.000, 7);
        daftarKue[5] = new KueBasi("Kue Kopi", 12.000, 15);
        daftarKue[6] = new KuePesanan("Kue Moka", 8.000, 4.0);
        daftarKue[7] = new KuePesanan("Kue Madu", 12.000, 2.0);
        daftarKue[8] = new KueJadi("Kue Bluberi", 18.000, 6);
        daftarKue[9] = new KueJadi("Kue Meses", 22.000, 4);
        daftarKue[10] = new KueBasi("Kue Nanas", 15.000, 9);
        daftarKue[11] = new KueBasi("Kue Cadburry", 10.000, 20);
        daftarKue[12] = new KuePesanan("Kue Kukis n Krim", 7.000, 3.5);
        daftarKue[13] = new KuePesanan("Kue Yoghurt", 11.000, 2.0);
        daftarKue[14] = new KueJadi("Kue Vanilla", 16.000, 7);
        daftarKue[15] = new KueJadi("Kue Bubble Gum", 21.000, 5);
        daftarKue[16] = new KueBasi("Kue Duren", 13.000, 10);
        daftarKue[17] = new KueBasi("Kue Cappuccino", 9.000, 18);
        daftarKue[18] = new KuePesanan("Kue Hazelnut", 6.000, 4.5);
        daftarKue[19] = new KuePesanan("Kue Milky", 13.000, 2.5);

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan semua kue");
            System.out.println("2. Hitung total harga dari semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan total lama hari dari KueBasi");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaKue(daftarKue);
                    break;
                case 2:
                    hitungTotalHargaSemuaKue(daftarKue);
                    break;
                case 3:
                    hitungTotalHargaDanBeratKuePesanan(daftarKue);
                    break;
                case 4:
                    hitungTotalHargaDanJumlahKueJadi(daftarKue);
                    break;
                case 5:
                    tampilkanKueDenganHargaTerbesar(daftarKue);
                    break;
                case 6:
                    hitungTotalHargaDanLamaHariKueBasi(daftarKue);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 0);
        scanner.close();
    }

    private static void tampilkanSemuaKue(Kue[] daftarKue) {
        System.out.println("Daftar Kue:");
        for (Kue kue : daftarKue) {
            if (kue != null) {
                System.out.println(kue);
            }
        }
    }

    private static void hitungTotalHargaSemuaKue(Kue[] daftarKue) {
        double totalHarga = 0;
        for (Kue kue : daftarKue) {
            if (kue != null) {
                totalHarga += kue.hitungHarga();
            }
        }
        System.out.println("Total harga semua jenis kue: " + totalHarga);
    }

    private static void hitungTotalHargaDanBeratKuePesanan(Kue[] daftarKue) {
        double totalHarga = 0;
        double totalBerat = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHarga += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total harga KuePesanan: " + totalHarga);
        System.out.println("Total berat KuePesanan: " + totalBerat);
    }

    private static void hitungTotalHargaDanJumlahKueJadi(Kue[] daftarKue) {
        double totalHarga = 0;
        int totalJumlah = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHarga += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total harga KueJadi: " + totalHarga);
        System.out.println("Total jumlah KueJadi: " + totalJumlah);
    }

    private static void tampilkanKueDenganHargaTerbesar(Kue[] daftarKue) {
        double hargaTerbesar = 0;
        Kue kueTerbesar = null;
        for (Kue kue : daftarKue) {
            if (kue != null && kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        if (kueTerbesar != null) {
            System.out.println("Informasi Kue dengan harga terbesar:");
            System.out.println(kueTerbesar);
        } else {
            System.out.println("Tidak ada kue yang tersedia.");
        }
    }

    private static void hitungTotalHargaDanLamaHariKueBasi(Kue[] daftarKue) {
        double totalHarga = 0;
        int totalLamaHari = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueBasi) {
                totalHarga += kue.hitungHarga();
                totalLamaHari += ((KueBasi) kue).getLamaHari();
            }
        }
        System.out.println("Total harga KueBasi: " + totalHarga);
        System.out.println("Total lama hari KueBasi: " + totalLamaHari);
    }
}
