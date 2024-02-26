package Tugas1; 
import java.util.Scanner;

public class Tugas1 {
    static Scanner scanner = new Scanner(System.in);
    static String[] mataKuliah = {"Matematika Komputasi", "Pemrograman Berorientasi Objek", "Statistika Dasar"};
    static String[][] jadwalMataKuliah = {
            {"Matematika Komputasi", "Senin", "09:30 - 11:59"},
            {"Pemrograman Berorientasi Objek", "Rabu", "07:00 - 08:39"},
            {"Statistika Dasar", "Jumat", "09:30 - 11:59"}
    };
    static double[] nilaiMahasiswa = new double[mataKuliah.length];

    public static void main(String[] args) {
        System.out.println("Selamat datang di Sistem Informasi Akademik Mahasiswa");

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Pendaftaran Mata Kuliah");
            System.out.println("2. Cek Jadwal Mata Kuliah");
            System.out.println("3. Pengelolaan Nilai");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    pendaftaranMataKuliah();
                    break;
                case 2:
                    cekJadwalMataKuliah();
                    break;
                case 3:
                    pengelolaanNilai();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan Sistem Informasi Akademik Mahasiswa");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 4);
    }

    static void pendaftaranMataKuliah() {
        System.out.println("\nPendaftaran Mata Kuliah");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }

        System.out.print("Pilih mata kuliah (1-" + mataKuliah.length + "): ");
        int indexMataKuliah = scanner.nextInt() - 1;

        if (indexMataKuliah >= 0 && indexMataKuliah < mataKuliah.length) {
            System.out.println("Anda telah mendaftar mata kuliah " + mataKuliah[indexMataKuliah]);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    static void cekJadwalMataKuliah() {
        System.out.println("\nJadwal Mata Kuliah");
        for (String[] jadwal : jadwalMataKuliah) {
            System.out.println("Mata Kuliah: " + jadwal[0]);
            System.out.println("Hari: " + jadwal[1]);
            System.out.println("Jam: " + jadwal[2]);
            System.out.println();
        }
    }

    static void pengelolaanNilai() {
        System.out.println("\nPengelolaan Nilai");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai untuk mata kuliah " + mataKuliah[i] + ": ");
            nilaiMahasiswa[i] = scanner.nextDouble();
        }

        System.out.println("\nNilai Mahasiswa");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println(mataKuliah[i] + ": " + nilaiMahasiswa[i]);
        }
    }
}
