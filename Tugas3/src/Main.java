import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Dosen dosen1 = new Dosen("5842533", "Vanessa Dewi Agustina", "Pemrograman", "Dosen Tetap");

        System.out.println("Informasi Dosen:");
        System.out.println("NIDN: " + dosen1.getNIDN());
        System.out.println("Nama: " + dosen1.getNama());
        System.out.println("Bidang Keahlian: " + dosen1.getBidangKeahlian());
        System.out.println("Jabatan: " + dosen1.getJabatan());
        System.out.println();

        PenelitianDosen penelitian1 = new PenelitianDosen("Integrasi Fitur Navigasi Google Maps pada Helm Cerdas", 2022, 2023, "Selesai", dosen1);

        System.out.println("Judul Penelitian Sebelumnya: " + penelitian1.getJudul());
        System.out.println("Tahun Penelitian: Mulai " + penelitian1.getTahunMulai() + " - " + penelitian1.getTahunSelesai());

        System.out.print("Masukkan status penelitian baru: ");
        String statusBaru = input.nextLine();
        penelitian1.setStatus(statusBaru);
        System.out.println("Status Penelitian Baru: " + penelitian1.getStatus());
        System.out.println();

        MataKuliah matkul1 = new MataKuliah("PBO584", "Pemrograman Berorientasi Objek", 3, dosen1);

        System.out.println("Informasi Mata Kuliah:");
        System.out.println("Kode: " + matkul1.getKode());
        System.out.println("Mata Kuliah: " + matkul1.getNama());
        System.out.println("SKS: " + matkul1.getSKS());
        System.out.println("Dosen Pengajar: " + matkul1.getDosenPengajar().getNama());
        System.out.println();

        input.close(); 
    }
}

