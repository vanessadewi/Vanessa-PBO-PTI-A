import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Perpustakaan {
    private String namaBuku;
    private int tahunBuku;
    private String penulis;
    private String penerbit;

    public void tampilkanSesuaiKategori(int pilihan) {
        System.out.print("Kategori : ");
        switch (pilihan) {
            case 1:
                System.out.println("Teknologi\n");
                bacaDariFile("C:\\235150601111005-Vanessa\\Vanessa-PBO-PTI-A\\Tugas2\\Tugas Praktikum\\Teknologi.txt");
                break;
            case 2:
                System.out.println("Filsafat\n");
                bacaDariFile("C:\\235150601111005-Vanessa\\Vanessa-PBO-PTI-A\\Tugas2\\Tugas Praktikum\\Filsafat.txt");
                break;
            case 3:
                System.out.println("Sejarah\n");
                bacaDariFile("C:\\235150601111005-Vanessa\\Vanessa-PBO-PTI-A\\Tugas2\\Tugas Praktikum\\Sejarah.txt");
                break;
            case 4:
                System.out.println("Agama\n");
                bacaDariFile("C:\\235150601111005-Vanessa\\Vanessa-PBO-PTI-A\\Tugas2\\Tugas Praktikum\\Agama.txt");
                break;
            case 5:
                System.out.println("Psikologi\n");
                bacaDariFile("C:\\235150601111005-Vanessa\\Vanessa-PBO-PTI-A\\Tugas2\\Tugas Praktikum\\Psikologi.txt");
                break;
            case 6:
                System.out.println("Politik\n");
                bacaDariFile("C:\\235150601111005-Vanessa\\Vanessa-PBO-PTI-A\\Tugas2\\Tugas Praktikum\\Politik.txt");
                break;
            case 7:
                System.out.println("Fiksi\n");
                bacaDariFile("C:\\235150601111005-Vanessa\\Vanessa-PBO-PTI-A\\Tugas2\\Tugas Praktikum\\Fiksi.txt");
                break;
            default:
                System.out.println("Kategori tidak valid.");
                break;
        }
    }

    private void bacaDariFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    tampilkanBuku(parts[0], parts[1], parts[2]);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
    
    public void pinjamBuku() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String judul = input.nextLine();
        System.out.println("Buku " + judul + " berhasil dipinjam.");

    }

    public void kembaliBuku() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
        String judul = input.nextLine();
        System.out.println("Buku " + judul + " berhasil dikembalikan.");
        
    }

    private void tampilkanBuku(String judulBuku, String penulis, String penerbit) {
        System.out.println("Judul   : " + judulBuku);
        System.out.println("Penulis : " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("");
    }
}
