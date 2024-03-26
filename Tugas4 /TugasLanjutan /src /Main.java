import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        Data data = new Data();

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Lihat data Dosen");
            System.out.println("2. Tambah data Dosen");
            System.out.println("3. Ubah data Dosen");
            System.out.println("4. Hapus data Dosen");
            System.out.println("5. Simpan data ke file");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    data.lihatDataDosen();
                    System.out.println("Data Dosen\n");
                    System.out.println("23515, Vanessa Dewi Agustina, Pemrograman, Kaprodi");
                    System.out.println("23516, Naylah Yasmin Arifin, Statistika, Dosen Tetap");
                    System.out.println("23517, Ibadun Nazratul Lathifah, Sistem Operasi, Dosen Tetap");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Masukkan NIDN: ");
                    String nidn = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Bidang Keahlian: ");
                    String bidangKeahlian = scanner.nextLine();
                    System.out.print("Masukkan Jabatan: ");
                    String jabatan = scanner.nextLine();
                    Dosen dosen = new Dosen(nidn, nama, bidangKeahlian, jabatan);
                    data.tambahDataDosen(dosen);
                    break;
                case 3:
                    System.out.print("Masukkan NIDN dosen yang akan diubah: ");
                    String nidnToEdit = scanner.nextLine();
                    data.ubahDataDosen(nidnToEdit);
                    break;
                case 4:
                    System.out.print("Masukkan NIDN dosen yang akan dihapus: ");
                    String nidnToDelete = scanner.nextLine();
                    data.hapusDataDosen(nidnToDelete);
                    break;
                case 5:
                    System.out.println("Simpan data ke file...");
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        scanner.close();
    }
}
